SUMMARY = "KReversi is is a simple strategy game played against the computer"
DESCRIPTION = "KReversi is is a simple one player strategy game played against the computer"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    kdoctools-native \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    kdeclarative \
    ki18n \
    kiconthemes \
    kio \
    kxmlgui \
    kwidgetsaddons \
    kdoctools \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "4bb65e60620592a18c2c15941670e02c"
SRC_URI[sha256sum] = "855dae16b754eaea763c5d28d8fa56d72ad82459d2b7e7fc951d43084ff98ffa"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
"
