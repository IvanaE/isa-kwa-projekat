package com.ivana.isa.kwa.projekat.security;

import com.ivana.isa.kwa.projekat.security.utils.TokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Slf4j
public class AuthenticationTokenFilter extends UsernamePasswordAuthenticationFilter {
    @Autowired
    UserDetailsService userDetailsService;
    
    @Autowired
    private TokenUtils tokenUtils;
    
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)req;
        
        String authToken = httpRequest.getHeader("Authorization");
        if (authToken != null) {
            authToken = authToken.replace("Bearer ", "");
        }
        
        String username = tokenUtils.getUsername(authToken);
        
        Authentication authentication = SecurityContextHolder.getContext()
                                                .getAuthentication();
        if ((username != null) && (authentication == null)) {
            
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            
            if (tokenUtils.validateToken(authToken, userDetails)) {
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null,
                                                                                                                                  userDetails.getAuthorities());
                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpRequest));
                SecurityContextHolder.getContext()
                        .setAuthentication(usernamePasswordAuthenticationToken);
            }
        }
        super.doFilter(req, res, chain);
    }
}
