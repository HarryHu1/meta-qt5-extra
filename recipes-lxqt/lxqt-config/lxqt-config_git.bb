SUMMARY = "LXQt system settings center"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check gtk-icon-cache

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libkscreen libxcursor"

SRCREV = "529f2dea846512dd4e82167c32535f2c530aa3e1"
PV = "0.11.1"

# there are no dev files / pack liblxqt-config-cursor.so correctly
FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/lxqt/icons \
    ${libdir}/liblxqt-config-cursor.so \
"
FILES_${PN}-dev = ""
