
package org.mpilone.vaadin.timeline;

import java.util.Date;

import org.mpilone.vaadin.timeline.TimelineOptions.ItemType;


/**
 * A timeline item that defines the required properties for events on the
 * timeline.
 *
 * @author mpilone
 */
public interface TimelineItem {

  /**
   * Returns the unique ID of this item.
   *
   * @return the unique ID of the item
   */
  public Object getId();

  /**
   * Returns the ID of the group that the event belongs to. All events with the
   * same group ID will be displayed together on the timeline in a single group
   * row.
   *
   * @return the name of the group or null if not in a group
   */
  public String getGroupId();

  /**
   * Gets start date of event.
   *
   * @return Start date.
   */
  public Date getStart();

  /**
   * Get end date of event.
   *
   * @return End date;
   */
  public Date getEnd();

  /**
   * Gets content text of event.
   *
   * @return content text
   */
  public String getContent();

  /**
   * Returns the type of the item. The item type determines how the item will be
   * rendered on the timeline.
   *
   * @return the item type or null for the timeline default
   */
  public ItemType getType();

  /**
   * The optional CSS style name(s) to be applied to the group.
   *
   * @return the CSS style name(s)
   */
  public String getStyleName();

  /**
   * Returns the title for the item, displayed when holding the mouse on the
   * item. The title can only contain plain text.
   *
   * @return the title or null if not set
   */
  public String getTitle();
}
