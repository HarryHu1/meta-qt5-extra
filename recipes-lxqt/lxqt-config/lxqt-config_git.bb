SUMMARY = "LXQt system settings center"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check gtk-icon-cache

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libkscreen libxcursor xf86-input-libinput"

SRCREV = "d69038af179f02601deeb68110fd905c403dd4d7"
PV = "0.14.0"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/lxqt/icons \
"
