#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
    INSERT INTO role (role_name) VALUES 'USER'
    INSERT INTO role (role_name) VALUES 'ADMIN'
EOSQL