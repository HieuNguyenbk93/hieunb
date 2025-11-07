set -e
mvn -pl . clean install
mvn -pl hieunb-sdk clean install
mvn -pl hieunb-admin-plugin clean install -Pexport,\!test
mvn -pl hieunb-socket-plugin clean install -Pexport,\!test
mvn -pl hieunb-socket-app clean install -Pexport,\!test
mvn -pl hieunb-web-plugin clean install -Pexport,\!test
mvn -pl hieunb-theme clean install -Pexport,\!test
ezy.sh package
ezy.sh export
