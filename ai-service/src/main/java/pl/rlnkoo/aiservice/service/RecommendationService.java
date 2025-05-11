package pl.rlnkoo.aiservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.rlnkoo.aiservice.model.Recommendation;
import pl.rlnkoo.aiservice.repository.RecommendationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendationService {

    private final RecommendationRepository recommendationRepository;

    public List<Recommendation> getUserRecommendations(String userId) {
        return recommendationRepository.findByUserId(userId);
    }

    public Recommendation getActivityRecommendation(String activityId) {
        return recommendationRepository.findByActivityId(activityId)
                .orElseThrow(() -> new RuntimeException("No recommendation found for activity id " + activityId));
    }
}
