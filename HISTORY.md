# Timeline for Vaadin History

## SNAPSHOT, v1.3.0

## 2015-04-21, v1.2.1

- Fixed a bug where the time axis scale was required when it should be an optional configuration parameter.

## 2015-04-09, v1.2.0

- Added support for setting format labels for major/minor labels.
- Added support for "background" item type.
- Added showMajorAxis and showMinorAxis toggles to the demo.
- Upgraded to Vaadin 7.4.3.
- Upgraded to vis.js 3.11.0.
- Added removeAllItems to the BasicItemProvider.
- Upgraded to vis.js 3.3.
- Exposed setCurrentTime method.
- Exposed margin.item.vertical, margin.item.horizontal, clickToUse options.
- Added try/catch to handle an exception thrown when trying to destroy the 
  timeline. See https://github.com/almende/vis/issues/294
- Added delete image and vis.map to the published "stylesheet" files so they 
  are accessible on the client.

## 2014-07-18, v1.1.0

- Upgraded to vis.js 3.0. 
- Added support for the new title field in a timeline item. 
- Removed duplication of the items and groups on the client side because the array bug is fixed.

## 2014-06-20, v1.0.0

- Initial release.