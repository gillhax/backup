package quiz.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(
   name = "jhi_social_user_connection"
)
@Cache(
   usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE
)
public class SocialUserConnection implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(
      strategy = GenerationType.AUTO
   )
   private Long id;
   @NotNull
   @Column(
      name = "user_id",
      length = 255,
      nullable = false
   )
   private String userId;
   @NotNull
   @Column(
      name = "provider_id",
      length = 255,
      nullable = false
   )
   private String providerId;
   @NotNull
   @Column(
      name = "provider_user_id",
      length = 255,
      nullable = false
   )
   private String providerUserId;
   @NotNull
   @Column(
      nullable = false
   )
   private Long rank;
   @Column(
      name = "display_name",
      length = 255
   )
   private String displayName;
   @Column(
      name = "profile_url",
      length = 255
   )
   private String profileURL;
   @Column(
      name = "image_url",
      length = 255
   )
   private String imageURL;
   @NotNull
   @Column(
      name = "access_token",
      length = 255,
      nullable = false
   )
   private String accessToken;
   @Column(
      length = 255
   )
   private String secret;
   @Column(
      name = "refresh_token",
      length = 255
   )
   private String refreshToken;
   @Column(
      name = "expire_time"
   )
   private Long expireTime;

   public SocialUserConnection() {
   }

   public SocialUserConnection(String userId, String providerId, String providerUserId, Long rank, String displayName, String profileURL, String imageURL, String accessToken, String secret, String refreshToken, Long expireTime) {
      this.userId = userId;
      this.providerId = providerId;
      this.providerUserId = providerUserId;
      this.rank = rank;
      this.displayName = displayName;
      this.profileURL = profileURL;
      this.imageURL = imageURL;
      this.accessToken = accessToken;
      this.secret = secret;
      this.refreshToken = refreshToken;
      this.expireTime = expireTime;
   }

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getUserId() {
      return this.userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getProviderId() {
      return this.providerId;
   }

   public void setProviderId(String providerId) {
      this.providerId = providerId;
   }

   public String getProviderUserId() {
      return this.providerUserId;
   }

   public void setProviderUserId(String providerUserId) {
      this.providerUserId = providerUserId;
   }

   public Long getRank() {
      return this.rank;
   }

   public void setRank(Long rank) {
      this.rank = rank;
   }

   public String getDisplayName() {
      return this.displayName;
   }

   public void setDisplayName(String displayName) {
      this.displayName = displayName;
   }

   public String getProfileURL() {
      return this.profileURL;
   }

   public void setProfileURL(String profileURL) {
      this.profileURL = profileURL;
   }

   public String getImageURL() {
      return this.imageURL;
   }

   public void setImageURL(String imageURL) {
      this.imageURL = imageURL;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
   }

   public String getSecret() {
      return this.secret;
   }

   public void setSecret(String secret) {
      this.secret = secret;
   }

   public String getRefreshToken() {
      return this.refreshToken;
   }

   public void setRefreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
   }

   public Long getExpireTime() {
      return this.expireTime;
   }

   public void setExpireTime(Long expireTime) {
      this.expireTime = expireTime;
   }

   public boolean equals(Object o) {
      if(this == o) {
         return true;
      } else if(o != null && this.getClass() == o.getClass()) {
         SocialUserConnection user = (SocialUserConnection)o;
         return this.id.equals(user.id);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hashCode(this.id);
   }

   public String toString() {
      return "SocialUserConnection{id=" + this.id + ", userId=" + this.userId + ", providerId=\'" + this.providerId + '\'' + ", providerUserId=\'" + this.providerUserId + '\'' + ", rank=" + this.rank + ", displayName=\'" + this.displayName + '\'' + ", profileURL=\'" + this.profileURL + '\'' + ", imageURL=\'" + this.imageURL + '\'' + ", accessToken=\'" + this.accessToken + '\'' + ", secret=\'" + this.secret + '\'' + ", refreshToken=\'" + this.refreshToken + '\'' + ", expireTime=" + this.expireTime + '}';
   }
}
