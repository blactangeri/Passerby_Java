-- Need to turn off these checks to we can create constraints to tables that do not exist yet
set FOREIGN_KEY_CHECKS=0;
set UNIQUE_CHECKS=0;

use auth;

--
-- TABLE: LOGIN
--

CREATE TABLE LOGIN (
  LoginID               INT AUTO_INCREMENT,
  ClientID              INT                                    NOT NULL,
  PortalConfigurationID INT,
  PasswordID            INT                                    NOT NULL,
  Username              VARCHAR(16)                            NOT NULL,
  FirstName             VARCHAR(128)                           NOT NULL,
  LastName              VARCHAR(128)                           NOT NULL,
  Email                 VARCHAR(128)                           NOT NULL,
  StartDate             DATETIME,
  EndDate               DATETIME,
  Locale                VARCHAR(10) DEFAULT 'en_US'            NOT NULL,
  TimeZone              VARCHAR(50) DEFAULT 'America/New_York' NOT NULL,
  Created               DATETIME                               NOT NULL,
  Updated               DATETIME                               NOT NULL,
  LoginAllowed          TINYINT DEFAULT 1                      NOT NULL,
  ExternalID            VARCHAR(255),
  Title                 VARCHAR(50),
  LoginPhotoID          INT,
  AboutMe               VARCHAR(2000),
  band                  INT,
  Expired               TINYINT DEFAULT 0                      NOT NULL,
  LastExpirationDate    DATETIME,
  PRIMARY KEY (LoginID)
)
  ENGINE = INNODB;

