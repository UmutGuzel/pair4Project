package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Integer> {
}
