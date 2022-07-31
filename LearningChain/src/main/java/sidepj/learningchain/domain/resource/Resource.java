package sidepj.learningchain.domain.resource;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import sidepj.learningchain.domain.common.BaseEntity;
import sidepj.learningchain.domain.review.Review;

@Entity
@Getter
@NoArgsConstructor
public class Resource extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RESOURCE_ID")
	private Long id;

	private String title;

	private String tag;

	private int likeCount;

	private int hateCount;

	@OneToMany(mappedBy = "resource")
	private List<Review> reviews = new ArrayList<>();
}
