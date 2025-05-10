CREATE DATABASE REVIVE
GO

USE REVIVE
CREATE TABLE USERS (
Username VARCHAR(50) PRIMARY KEY,
Password VARCHAR(50) NOT NULL
);
GO
use REVIVE
create table PROJECT_ECOSYSTEM (
ProjectId int identity primary key
, ProyectName varchar(30) not null
, EcoType varchar(30) not null
, Location varchar(30) not null
, RestaurationDate date not null
);
go
use REVIVE
create table SPECIES (
SpeciesId int identity primary key
, CommonName varchar(30) not null
, ScientificName varchar(30) not null
, DangerSpecies bit not null
, SpeciesLocation varchar(30) not null
);
GO
USE REVIVE
CREATE TABLE MAMMAL (
SpeciesId INT NOT NULL,
Hair VARCHAR(6) CHECK (Hair IN ('Long', 'Short', 'Medium')) NOT NULL,
Marsupial bit NOT NULL,
PRIMARY KEY (SpeciesId),
FOREIGN KEY (SpeciesId) REFERENCES SPECIES(SpeciesId)
);
GO
USE REVIVE
CREATE TABLE REPTILE (
SpeciesId INT NOT NULL,
Poisonous BIT NOT NULL,
ColorChange BIT NOT NULL,
PRIMARY KEY (SpeciesId),
FOREIGN KEY (SpeciesId) REFERENCES SPECIES(SpeciesId)
);
GO
USE REVIVE
CREATE TABLE BIRD (
SpeciesId INT NOT NULL,
TypeBeak VARCHAR(7) CHECK (TypeBeak IN ('Cracker', 'Hook', 'Chisel')) NOT NULL,
MigrationSeason VARCHAR CHECK (MigrationSeason IN ('Spring', 'Summer', 'Autum', 'Winter')) NOT NULL,
PRIMARY KEY (SpeciesId),
FOREIGN KEY (SpeciesId) REFERENCES SPECIES(SpeciesId)
);


go
use REVIVE
create table ORGANIZATION (
OrganizationId int identity primary key
, Head varchar(30) not null
, OrganizationName varchar(30) not null
, OrganizationPhone char(9) check (OrganizationPhone like ('[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')) not null,
ProjectID INT NOT NULL,
FOREIGN KEY (ProjectID) REFERENCES PROJECT_ECOSYSTEM(ProjectID)
);
go
use REVIVE
create table EMPLOYEE (
EmployeeId int identity primary key
, EmployeeName varchar(30) not null
, EmployeePhone char(9) check (EmployeePhone like ('[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')) not null
, EmployeeAge tinyint not null
, Surname1 varchar(30) not null
, Surname2 varchar(30) not null
, Job varchar(30) not null
, OrganizationId INT NOT NULL
, foreign key (OrganizationId) references ORGANIZATION(OrganizationId)
);
go
use REVIVE
create table DONOR (
DonorId int identity primary key
, DonorName varchar(30) not null
, Surname1 varchar(30) not null
, Surname2 varchar(30) not null
, DonorPhone char(9) check (DonorPhone like ('[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')) not null
, DonorAge tinyint not null
, TotalDonated money not null
);
go
use REVIVE
create table DONATION (
OrganizationId int
, DonorId int
, AmountDonated money not null
, primary key (OrganizationId, DonorId)
, foreign key (OrganizationId) references ORGANIZATION(OrganizationId)
, foreign key (DonorId) references DONOR(DonorId)
);
go
use REVIVE
create table ECOSYSTEM_SPECIES (
SpeciesId int
, ProyectId int
, primary key (SpeciesId, ProyectId)
, foreign key (ProyectId) references PROJECT_ECOSYSTEM(ProjectId)
, foreign key (SpeciesId) references SPECIES(SpeciesId)
);
go
use REVIVE
create table VOLUNTEER (
VolunteerId int identity primary key
, VolunteerName varchar(30) not null
, Surname1 varchar(30) not null
, Surname2 varchar(30) not null
, Address varchar(30) not null
, Phone char(9) check (Phone like ('[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')) not null
, ProjectID INT NOT NULL,
FOREIGN KEY (ProjectID) REFERENCES PROJECT_ECOSYSTEM(ProjectID)
);