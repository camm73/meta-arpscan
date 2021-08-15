# meta-arpscan Yocto Layer
A layer including a recipe `arp-scan` for building the following `arp-scan` CLI tool: https://github.com/royhills/arp-scan

## Adding the meta-arpscan layer to your build
* Clone this layer into your sources directory
* Run `bitbake-layers add-layer <sources directory path>/meta-arpscan`
* Add `IMAGE_INSTALL_append += " arp-scan"` to `local.conf` to include the `arp-scan` recipe in your image
