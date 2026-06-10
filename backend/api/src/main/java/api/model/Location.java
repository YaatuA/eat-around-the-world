package api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
@Entity
@Table(name = "locations")
@Data
@NoArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "place_id", nullable = false, unique = true)
    private String placeId;
    private String name;
    private String address;
    private String country;
    @Column(name = "cuisine_type")
    private String cuisineType;
    private String phone;
    @Column(name = "photo_url")
    private String photoUrl;
    @Column(name = "maps_url")
    private String mapsUrl;
    @Column(name = "personal_review", columnDefinition = "TEXT")
    private String personalReview;
    @Column(name = "personal_rating")
    private Integer personalRating;
    private Boolean visited = false;
    // NULL = active record. A timestamp here = record is in the recycling bin.
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
