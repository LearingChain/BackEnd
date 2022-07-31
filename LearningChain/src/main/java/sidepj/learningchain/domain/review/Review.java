package sidepj.learningchain.domain.review;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import sidepj.learningchain.domain.common.BaseEntity;
import sidepj.learningchain.domain.resource.Resource;

@Entity
@Getter
@NoArgsConstructor
public class Review extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REVIEW_ID")
	private Long id;

	private int likeCount;

	private int hateCount;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESOURCE_ID")
	private Resource resource;



}
