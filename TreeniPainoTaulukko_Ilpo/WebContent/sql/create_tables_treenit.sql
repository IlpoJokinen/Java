CREATE TABLE rintatreeni(
id int not null,
penkkiTulos decimal(4,1) not null,
vinopenkkiTulos decimal(4,1) not null,
ristitaljaTulos decimal(3,1) not null,
flyesTulos decimal(3,1) not null,
takaolkaTulos decimal(3,1) not null,
vipariSTulos decimal(3,1) not null,
vipariETulos decimal(3,1) not null,			
kapPenkkiTulos decimal(4,1) not null,
hauiskaantoTulos decimal(3,1) not null,
primary key(id)
)engine=InnoDB;

CREATE TABLE jalkatreeni(
id int not null,
kyykkyTulos decimal(4,1) not null,
hackTulos decimal(4,1) not null,
prassiTulos decimal(4,1) not null,
takareidetTulos decimal(3,1) not null,		
askKavelTulos decimal(3,1) not null,
pohkeetTulos decimal(4,1) not null,
primary key(id)
)engine=InnoDB;

CREATE TABLE kasitreeni(
id int not null,
pystPunnerTulos decimal(4,1) not null,
takaolatTulos decimal(3,1) not null,
vipariSivTulos decimal(3,1) not null,
ojentajaTaljaTulos decimal(3,1) not null,
hauisScottTulos decimal(3,1) not null,
ojentajaPunnerTulos decimal(3,1) not null,
hauisKPTulos decimal(3,1) not null,
primary key(id)
)engine=InnoDB;

CREATE TABLE selkatreeni(
id int not null,
kulmasoutuTulos decimal(4,1) not null,
ylaTaljaTulos decimal(4,1) not null,
yhdKadenSoutuTulos decimal(3,1) not null,
alataljaTulos decimal(4,1) not null,
sjmvTulos decimal(4,1) not null,
takareisiTulos decimal(3,1) not null,
primary key(id)
)engine=InnoDB;