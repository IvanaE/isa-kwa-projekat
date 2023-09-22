INSERT INTO forum (javni, naziv) VALUES (true, 'Šminka za Početnike');
INSERT INTO forum (javni, naziv) VALUES (true, 'Saveti za Profesionalni Makeup');
INSERT INTO forum (javni, naziv) VALUES (true, 'Recenzije Makeup Proizvoda');
INSERT INTO forum (javni, naziv) VALUES (true, 'Tehnike Konturisanja');
INSERT INTO forum (javni, naziv) VALUES (true, 'Najnoviji Makeup Trendovi');

INSERT INTO registrovan_korisnik (email, korisnicko_ime, lozinka) VALUES ('user@test.com', 'user', '{bcrypt}$2a$12$HUO7CagCx79XGjveyfHXKutNI77mMjbP1nwHM3Uyf.mtlYURc0mju');
INSERT INTO registrovan_korisnik (email, korisnicko_ime, lozinka) VALUES ('admin@test.com', 'admin', '{bcrypt}$2a$12$HUO7CagCx79XGjveyfHXKutNI77mMjbP1nwHM3Uyf.mtlYURc0mju');

INSERT INTO korisnik_na_forumu (korisnicko_ime, forum_id, registrovan_korisnik_id) VALUES ('user', 1, 1);
INSERT INTO korisnik_na_forumu (korisnicko_ime, forum_id, registrovan_korisnik_id) VALUES ('admin', 1, 2);

INSERT INTO uloga (naziv) VALUES ('POSETILAC');
INSERT INTO uloga (naziv) VALUES ('MODERATOR');
INSERT INTO uloga (naziv) VALUES ('ADMINISTRATOR');

-- Give the forum user their roles
INSERT INTO korisnik_na_forumu_uloge(uloge_id, korisnici_na_forumu_id) VALUES (1, 1);
INSERT INTO korisnik_na_forumu_uloge(uloge_id, korisnici_na_forumu_id) VALUES (2, 1);
INSERT INTO korisnik_na_forumu_uloge(uloge_id, korisnici_na_forumu_id) VALUES (3, 2);

---- Assign what forum user belongs to which forum
--INSERT INTO forum_korisnik_na_forumus(forum_id, korisnik_na_forumu_id) VALUES (1, 1);
--INSERT INTO forum_korisnik_na_forumus(forum_id, korisnik_na_forumu_id) VALUES (2, 2);

-- Topics for 'Šminka za Početnike' forum (Forum ID: 1)
INSERT INTO tema (naziv, forum_id) VALUES ('Osnove Šminke za Pocetnike', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Izbor Prave Boje Podloge', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Kako Da Naglasite Oči', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Ruž za Usne Saveti', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Brzo Makeup za Svaki Dan', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Šminka za Posebne Prilike', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Kako Se Rešiti Nekontrolisanog Sjaja Kože', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Trikovi za Savršene Obrve', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Prirodan Makeup Look', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Čišćenje Četkica', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Makeup za Crvenokose', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Najbolji Makeup za Leto', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Kako Pravilno Koristiti Rumene Korektore', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Makeup na Poslu', 1);
INSERT INTO tema (naziv, forum_id) VALUES ('Kako Da Istaknete Usne', 1);

-- Topics for 'Saveti za Profesionalni Makeup' forum (Forum ID: 2)
INSERT INTO tema (naziv, forum_id) VALUES ('Profesionalni Makeup Tehnike', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Izbor Pravih Profesionalnih Proizvoda', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Modeliranje Lica', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Najnovije Trendove u Profesionalnom Makeup-u', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Smokey Eye Tehniku', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Profesionalni Makeup za Fotografije', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Kako Se Pripremiti za Profesionalni Photoshoot', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Savršeni Makeup za Svečane Prilike', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Tehnike za Makeup Artistry', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Profesionalno Konturisanje', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Makeup na Modnim Pisticama', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Profesionalni Makeup za TV i Film', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Kako Postati Makeup Artist', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Profesionalno Blendiranje', 2);
INSERT INTO tema (naziv, forum_id) VALUES ('Najbolji Profesionalni Makeup Proizvodi', 2);

-- Topics for 'Recenzije Makeup Proizvoda' forum (Forum ID: 3)
INSERT INTO tema (naziv, forum_id) VALUES ('Recenzija Najnovijeg Ruža za Usne', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Iskustva sa Različitim Makeup Brendovima', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Recenzija Luksuznih Makeup Proizvoda', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Najbolji Nalazi u Drogerijama', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Recenzija Paleta Senki za Oči', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Kupovinu Prave Podloge', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Recenzija Četkica i Alatki za Makeup', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Iskustva sa Makeup Setovima', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Najnoviji Trendovi u Makeup Proizvodima', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Recenzija Korektora i Fiksatora', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Kako da Prepoznate Kvalitetne Makeup Proizvode', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Makeup Načine Upotrebe', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Recenzija Olovaka za Oči i Eyelinera', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Najnovije Inovacije u Makeup Tehnologiji', 3);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Makeup za Različite Tipove Kože', 3);

-- Topics for 'Tehnike Konturisanja' forum (Forum ID: 4)
INSERT INTO tema (naziv, forum_id) VALUES ('Osnove Konturisanja za Početnike', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Kako Naglasiti Jagodice', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Konturisanje za Ovalno Lice', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Kako Smanjiti Nos Konturisanjem', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Konturisanje Brade', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Konturisanje za Izduženo Lice', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Kako Istopiti Dvostruku Bradu', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Konturisanje za Srce-Shaped Lice', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Kako Korektovati Asimetrično Lice', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Konturisanje za Klasično Lice', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Konturisanje za Okruglo Lice', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Kako Dodati Dimenziju Vilici', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Konturisanje za Trokutasto Lice', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Prirodno Konturisanje', 4);
INSERT INTO tema (naziv, forum_id) VALUES ('Konturisanje za Posebne Prilike', 4);

-- Topics for 'Najnoviji Makeup Trendovi' forum (Forum ID: 5)
INSERT INTO tema (naziv, forum_id) VALUES ('Trendy Makeup za Leto', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Vampirski Makeup Trend', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Mermaid Makeup Umetnost', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Odsjajni Unicorn Makeup', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Grunge Makeup Revival', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Boho Chic Makeup Inspiracija', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Savremeni Artistic Makeup', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Najnovije Trendi Boje Ruževa', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Retro Glam Makeup Povratak', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Urban Decay Makeup Lookovi', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Kaleidoskop Makeup Kreativnost', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Futuristički Makeup Stil', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Saveti za Upotrebu Sjajnih Pigmenata', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Najnovije Makeup Trendove na Pisticama', 5);
INSERT INTO tema (naziv, forum_id) VALUES ('Inspiracija za Sezonske Makeup Lookove', 5);


---- Assign the above topics to the respective forum ( class forum gets the topics grade results, homework, etc )
--INSERT INTO forum_topics(forum_id, topics_id) VALUES (1, 1);
--INSERT INTO forum_topics(forum_id, topics_id) VALUES (1, 2);
--INSERT INTO forum_topics(forum_id, topics_id) VALUES (1, 3);
--INSERT INTO forum_topics(forum_id, topics_id) VALUES (2, 4);
--INSERT INTO forum_topics(forum_id, topics_id) VALUES (2, 5);
--INSERT INTO forum_topics(forum_id, topics_id) VALUES (2, 6);

-- Posts for topics in Forum ID 1 ('Šminka za Početnike')
-- Topic ID 1: Osnove Šminke za Početnike
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Osnove šminke za početnike: Koraci za savršen izgled!', NOW(), 1);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako izabrati pravi puder?', NOW(), 1);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najbolji proizvodi za šminkanje na brzinu.', NOW(), 1);

-- Topic ID 2: Izbor Prave Boje Podloge
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako odabrati pravu boju podloge za vašu kožu.', NOW(), 2);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Podloge za suvu kožu - saveti i preporuke.', NOW(), 2);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najnoviji trendovi u podlogama za šminkanje.', NOW(), 2);

-- Topic ID 3: Kako Da Naglasite Oči
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Saveti za postizanje intenzivnog izgleda očiju.', NOW(), 3);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Trikovi za šminkanje očiju uz pomoć eyelinera.', NOW(), 3);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Šminkanje za veče: senke za oči koje dominiraju!', NOW(), 3);

-- Topic ID 4: Ruž za Usne Saveti
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako izabrati pravu boju ruža za usne za svaku priliku.', NOW(), 4);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Saveti za dugotrajnost ruža za usne.', NOW(), 4);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Mat vs. sjajni ruž: koja tekstura je bolja?', NOW(), 4);

-- Topic ID 5: Brzo Makeup za Svaki Dan
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Brza jutarnja rutina šminkanja za posao.', NOW(), 5);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Saveti za šminkanje u pokretu: brze trikove!', NOW(), 5);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Makeup za svaki dan: naglasak na prirodnom izgledu.', NOW(), 5);

-- Topic ID 6: Šminka za Posebne Prilike
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Šminkanje za svečane prilike: glamurozni izgledi.', NOW(), 6);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako postići vintage makeup za tematske zabave.', NOW(), 6);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Saveti za makeup za venčanja i mature.', NOW(), 6);

-- Topic ID 7: Kako Se Rešiti Nekontrolisanog Sjaja Kože
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Trikovi za matiranje masne kože.', NOW(), 7);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako izabrati pravi puder za kontrolu sjaja.', NOW(), 7);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Nega kože i makeup za sjajnu kožu.', NOW(), 7);

-- Topic ID 8: Trikovi za Savršene Obrve
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Saveti za oblikovanje i popunjavanje obrva.', NOW(), 8);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Trikovi za postizanje prirodnih i definisanih obrva.', NOW(), 8);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Obrve kakve vam pristaju: oblik i boja.', NOW(), 8);

-- Topic ID 9: Prirodan Makeup Look
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako postići prirodan izgled bez preterivanja u šminkanju.', NOW(), 9);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najbolji proizvodi za postizanje svežeg i prirodnog tena.', NOW(), 9);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Prirodan makeup za svakodnevne aktivnosti.', NOW(), 9);

-- Topic ID 10: Saveti za Čišćenje Četkica
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako pravilno čistiti i održavati svoje četkice za šminkanje? Podelite svoje trikove!', NOW(), 10);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Koja sredstva za čišćenje četkica preporučujete? Delite svoje preporuke!', NOW(), 10);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Nega četkica i održavanje higijene - kako to radite?', NOW(), 10);

-- Topics in Forum ID 2 ('Saveti za Profesionalni Makeup')

-- Topic ID 11: Profesionalni Makeup Tehnike
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Dobrodošli u temu o profesionalnim makeup tehnikama! Danas ćemo govoriti o ključnim koracima za postizanje besprekornog makeupa. Počnimo sa savetima za pripremu kože.', NOW(), 11);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako postići savršeno konturisanje i osvetljavanje lica? Delite svoje trikove!', NOW(), 11);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najnovije tehnike blendiranja za profesionalni izgled - koje proizvode koristite?', NOW(), 11);

-- Topic ID 12: Izbor Pravih Profesionalnih Proizvoda
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Pri odabiru profesionalnih makeup proizvoda, kvalitet je ključan. Koje su vaše omiljene marke i proizvodi koji se neizostavno nalaze u vašem makeup setu?', NOW(), 12);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako se nositi sa širokim izborom proizvoda na tržištu? Delite svoje strategije za pronalaženje pravih proizvoda.', NOW(), 12);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najnoviji trendovi u profesionalnom makeupu - koje nove proizvode ste nedavno isprobali?', NOW(), 12);

-- Topic ID 13: Saveti za Modeliranje Lica
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Modeliranje lica je ključ za postizanje različitih izgleda. Kako istaći jagodice i oblikovati nos uz pomoć makeupa? Podelite svoje tehnike!', NOW(), 13);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako postići besprekorno konturisanje brade? Delite svoje savete za postizanje oštrih linija.', NOW(), 13);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Savršeno modeliranje za ovalno lice - koje trikove koristite?', NOW(), 13);

-- Topic ID 14: Najnovije Trendove u Profesionalnom Makeup-u
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najnoviji trendovi u profesionalnom makeupu donose inovacije u tehnikama i proizvodima. Koje su vaše omiljene nove tehnike?', NOW(), 14);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako se prilagoditi aktuelnim trendovima i inkorporirati ih u svoj makeup stil?', NOW(), 14);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Delite svoje utiske o najnovijim proizvodima koji su osvojili profesionalne makeup umetnike.', NOW(), 14);

-- Topic ID 15: Saveti za Smokey Eye Tehniku
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Smokey eye je klasičan izgled koji nikada ne izlazi iz mode. Kako postići intenzivan smokey eye uz pomoć različitih nijansi senki?', NOW(), 15);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Trikovi za postizanje seksi smokey eye izgleda za veče. Delite svoje omiljene boje senki!', NOW(), 15);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako da svoj smokey eye izgled prilagodite različitim prilikama? Podelite svoje ideje.', NOW(), 15);

-- Topic ID 16: Profesionalni Makeup za Fotografije
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Profesionalni makeup za fotografije zahteva posebne tehnike. Kako postići besprekorno lice na fotografijama?', NOW(), 16);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako pravilno koristiti osvetljavajuće proizvode za sjajan izgled na fotografijama? Delite svoje iskustvo!', NOW(), 16);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Koje su vaše omiljene tehnike za naglašavanje detalja na fotografijama?', NOW(), 16);

-- Topic ID 17: Saveti za Dugotrajan Makeup
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Dugotrajan makeup je ključan za posebne prilike. Kako da vaš makeup ostane savršen tokom celog dana ili noći?', NOW(), 17);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Koji su vaši omiljeni proizvodi za postizanje dugotrajnog makeupa? Delite svoje preporuke!', NOW(), 17);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Saveti za touch-up tokom dana - kako osvežiti makeup bez nanošenja nove šminke?', NOW(), 17);

-- Topic ID 18: Profesionalni Makeup za Posebne Prilike
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Profesionalni makeup za svečane prilike zahteva posebne tehnike. Kako postići glamurozan izgled za matursku veče?', NOW(), 18);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako izabrati pravi makeup za venčanja? Delite svoje iskustvo i inspiraciju!', NOW(), 18);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Saveti za postizanje besprekornog makeupa za fotografisanje na posebnim prilikama.', NOW(), 18);

-- Topics in Forum ID 3 ('Proizvodi za Makeup Recenzije')

-- Topic ID 19: Recenzije Šminke
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Dobrodošli u temu za recenzije šminke! Danas ćemo govoriti o najnovijim proizvodima na tržištu. Podelite svoje recenzije o proizvodima koje ste nedavno isprobali.', NOW(), 19);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako ocenjujete kvalitet i dugotrajnost šminke? Delite svoje kriterijume za ocenjivanje.', NOW(), 19);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najnoviji trendovi u šminkanju - koje proizvode biste preporučili za postizanje tih izgleda?', NOW(), 19);

-- Topic ID 20: Recenzije Kozmetičke Nege
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Recenzije kozmetičke nege su važne za održavanje zdrave kože. Kako ocenjujete proizvode za negu lica i tela?', NOW(), 20);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Koji su vaši omiljeni proizvodi za hidrataciju i čišćenje kože? Delite svoje recenzije.', NOW(), 20);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najbolji proizvodi za očuvanje mladalačkog izgleda - koje proizvode koristite i zašto su efikasni?', NOW(), 20);

-- Topic ID 21: Recenzije Makeup Četkica i Alatki
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kvalitetne makeup četkice i alatke su ključ za postizanje savršenog izgleda. Kako ocenjujete četkice i alatke koje koristite?', NOW(), 21);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Koje su vaše omiljene četkice za blendiranje i nanos makeupa? Delite svoje recenzije i savete za upotrebu.', NOW(), 21);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najnoviji alati za makeup - koje ste nedavno isprobali i kako su se pokazali?', NOW(), 21);

-- Topic ID 22: Recenzije Parfema i Mirisnih Proizvoda
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Miris je važan deo svakodnevnog rituala. Kako ocenjujete parfeme i mirisne proizvode koje koristite?', NOW(), 22);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Koji su vaši omiljeni mirisi i kako se drže tokom dana? Delite svoje recenzije i utiske.', NOW(), 22);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najnoviji mirisi na tržištu - koje su nove arome koje biste preporučili?', NOW(), 22);

-- Topic ID 23: Recenzije Veganskih i Prirodnih Proizvoda
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Veganski i prirodni proizvodi postaju sve popularniji. Kako ocenjujete njihovu efikasnost i sastav?', NOW(), 23);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Koji su vaši omiljeni veganski makeup proizvodi? Delite svoje recenzije i iskustva.', NOW(), 23);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Prirodna nega kože - koji proizvodi su se pokazali kao najbolji za vas? Podelite svoje mišljenje.', NOW(), 23);

-- Topic ID 24: Recenzije Luksuznih Makeup Proizvoda
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Luksuzni makeup proizvodi obećavaju visok kvalitet. Kako ocenjujete njihovu vrednost i performanse?', NOW(), 24);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Koji su vaši omiljeni luksuzni makeup brendovi i proizvodi? Delite svoje recenzije.', NOW(), 24);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Luksuzna nega kože - koji proizvodi su vam postali omiljeni i zašto?', NOW(), 24);

-- Topics in Forum ID 4 ('Saveti za Makeup Umjetnike')

-- Topic ID 25: Makeup Umjetnici - Početak Karijere
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Dobrodošli u temu o početku karijere makeup umjetnika! Danas ćemo razgovarati o prvim koracima na putu ka postizanju uspeha u svetu makeupa.', NOW(), 25);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako ste započeli svoju karijeru u makeupu? Podelite svoje priče i savete za mlade makeup umjetnike.', NOW(), 25);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najvažniji resursi za učenje i usavršavanje makeup veština - koje kurseve i materijale preporučujete?', NOW(), 25);

-- Topic ID 26: Tehnike Makeup Umjetnika
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Tehnike makeup umjetnika se razlikuju od svakodnevnog makeupa. Kako postići umetnički izgled uz pomoć različitih tehnika?', NOW(), 26);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako savladati body painting i specifične tehnike za stvaranje umetničkih dela na telu?', NOW(), 26);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Delite svoje iskustvo u kreiranju umetničkih makeup transformacija i inspirišite druge.', NOW(), 26);

-- Topic ID 27: Makeup Umjetnost na Tijelu
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Makeup umjetnost na telu zahteva posebne veštine. Kako stvarate detaljne slike na telu i licu?', NOW(), 27);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako se baviti body artom i stvarati impresivne slike na koži? Delite svoje tehnike i umetničke projekte.', NOW(), 27);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najnoviji trendovi u makeup umetnosti na telu - koje su nove ideje koje eksperimentišete?', NOW(), 27);

-- Topic ID 28: Makeup za Pozorište i Film
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Makeup za pozorište i film zahteva profesionalne veštine. Kako postići efekte za scenu i kameru?', NOW(), 28);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako raditi sa specijalnim efektima i maskama u filmskoj i pozorišnoj industriji? Podelite svoje iskustvo.', NOW(), 28);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najbolji proizvodi i tehnike za dugotrajne i realističke makeup transformacije na setu.', NOW(), 28);

-- Topic ID 29: Makeup za Modne Piste
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Makeup za modne piste donosi inovacije u svetu lepote. Kako se prilagoditi različitim modnim trendovima i kreirati unikatne lookove za revije?', NOW(), 29);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako sarađivati sa dizajnerima i stvarati makeup lookove koji se savršeno uklapaju u njihove kolekcije?', NOW(), 29);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najpoznatiji makeup umjetnici u svetu mode - inspirišite se njihovim radom i tehnikama.', NOW(), 29);

-- Topic ID 30: Saveti za Karijeru Makeup Umjetnika
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Karijera makeup umjetnika može biti izazovna. Kako se izdvajate u industriji i gradite svoj portfolio?', NOW(), 30);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako pravilno promovisati svoj rad i privući klijente? Delite svoje marketinške strategije.', NOW(), 30);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najvažniji saveti za uspešnu karijeru makeup umjetnika - kako ostvariti svoje profesionalne ciljeve.', NOW(), 30);

-- Topics in Forum ID 5 ('Šminka za Posebne Prilike')
-- Topic ID 31: Šminka za Svečane Prilike
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Dobrodošli u temu o šminkanju za svečane prilike! Danas ćemo razgovarati o tome kako postići glamurozan izgled za posebne događaje.', NOW(), 31);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako pravilno izabrati šminku za venčanja, maturske večeri i druge svečane prilike? Delite svoje savete.', NOW(), 31);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najnoviji trendovi u svečanom makeupu - koje lookove biste preporučili za posebne prilike?', NOW(), 31);

-- Topic ID 32: Šminka za Maturalne Večeri
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Maturalne večeri su posebni trenuci. Kako postići savršen makeup izgled za maturu? Delite svoje ideje.', NOW(), 32);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Koji su vaši omiljeni proizvodi za dugotrajan makeup na maturalnoj večeri? Podelite svoje recenzije.', NOW(), 32);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Saveti za postizanje mladalačkog izgleda za maturu - kako izgledati spektakularno na fotografijama.', NOW(), 32);

-- Topic ID 33: Šminka za Venčanja
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Šminka za venčanja zahteva posebno planiranje. Kako postići besprekoran izgled za nevestu i svatove?', NOW(), 33);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako se nositi sa emocionalnim trenucima na dan venčanja i zadržati savršen makeup? Delite svoje savete.', NOW(), 33);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najlepše šminkerske priče sa venčanja - podelite svoja iskustva i inspirišite druge.', NOW(), 33);

-- Topic ID 34: Šminka za Rođendane i Proslave
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Šminka za rođendane i proslave može biti razigrana i kreativna. Kako postići efektan izgled za posebne proslave?', NOW(), 34);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako odabrati šminku koja se uklapa sa temom proslave? Delite svoje ideje i inspiraciju.', NOW(), 34);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najbolji makeup proizvodi za dugotrajan izgled tokom noćnih proslava - podelite svoje preporuke.', NOW(), 34);

-- Topic ID 35: Šminka za Fotografisanje
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Šminka za fotografisanje zahteva posebne tehnike. Kako postići besprekoran izgled na fotografijama?', NOW(), 35);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako pravilno koristiti osvetljavajuće proizvode i senke za naglašavanje detalja na fotografijama? Podelite svoje iskustvo.', NOW(), 35);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najnoviji trendovi u makeupu za fotografisanje - koje su nove tehnike koje eksperimentišete?', NOW(), 35);

-- Topic ID 36: Šminka za Halloween i Tematske Proslave
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Halloween i tematske proslave pružaju priliku za kreativnu šminku. Kako stvarate fantastične tematske izglede?', NOW(), 36);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Kako pravilno koristiti specijalne efekte i lažne rane za kreiranje horor makeupa? Delite svoje trikove.', NOW(), 36);
INSERT INTO objava (sadrzaj, vreme_postavljanja, tema_id) VALUES ('Najupečatljiviji tematski makeup izgledi koje ste ikada kreirali - podelite svoje kreacije i iskustva.', NOW(), 36);

-- Forum ID 1: Šminka za Početnike
INSERT INTO fajl (opis, url, objava_id)
SELECT CONCAT('Fajl za objavu ', o.id), CONCAT('url-za-objavu-', o.id), o.id
FROM objava o
WHERE o.tema_id IN (1, 2, 3, 4)
  AND MOD(o.id, 4) = 0;

-- Forum ID 2: Profesionalni Makeup Tehnike
INSERT INTO fajl (opis, url, objava_id)
SELECT CONCAT('Fajl za objavu ', o.id), CONCAT('url-za-objavu-', o.id), o.id
FROM objava o
WHERE o.tema_id IN (5, 6, 7, 8)
  AND MOD(o.id, 4) = 0;

-- Forum ID 3
INSERT INTO fajl (opis, url, objava_id)
SELECT CONCAT('Fajl za objavu ', o.id), CONCAT('url-za-objavu-', o.id), o.id
FROM objava o
WHERE o.tema_id IN (9, 10, 11, 12)
  AND MOD(o.id, 4) = 0;

-- Forum ID 4
INSERT INTO fajl (opis, url, objava_id)
SELECT CONCAT('Fajl za objavu ', o.id), CONCAT('url-za-objavu-', o.id), o.id
FROM objava o
WHERE o.tema_id IN (13, 14, 15, 16)
  AND MOD(o.id, 4) = 0;

-- Forum ID 5
INSERT INTO fajl (opis, url, objava_id)
SELECT CONCAT('Fajl za objavu ', o.id), CONCAT('url-za-objavu-', o.id), o.id
FROM objava o
WHERE o.tema_id IN (17, 18, 19, 20)
  AND MOD(o.id, 4) = 0;