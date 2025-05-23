/*   */ package ai.grazie.model.auth;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\bf\030\0002\0020\001:\001\006R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lai/grazie/model/auth/GrazieUser;", "Lai/grazie/model/auth/GrazieAuthEntity;", "registration", "Lai/grazie/utils/mpp/time/Timestamp;", "getRegistration", "()Lai/grazie/utils/mpp/time/Timestamp;", "Plain", "model-auth"})
/*   */ public interface GrazieUser extends GrazieAuthEntity { @NotNull
/*   */   Timestamp getRegistration();
/*   */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\n¨\006\026"}, d2 = {"Lai/grazie/model/auth/GrazieUser$Plain;", "Lai/grazie/model/auth/GrazieUser;", "uuid", "Lai/grazie/utils/mpp/UUID;", "registration", "Lai/grazie/utils/mpp/time/Timestamp;", "(Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/mpp/time/Timestamp;)V", "getRegistration", "()Lai/grazie/utils/mpp/time/Timestamp;", "getUuid", "()Lai/grazie/utils/mpp/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model-auth"})
/*   */   public static final class Plain implements GrazieUser { @NotNull
/*   */     private final UUID uuid;
/*   */     
/* 9 */     public Plain(@NotNull UUID uuid, @NotNull Timestamp registration) { this.uuid = uuid; this.registration = registration; } @NotNull private final Timestamp registration; @NotNull public UUID getUuid() { return this.uuid; } @NotNull public Timestamp getRegistration() { return this.registration; }
/*   */ 
/*   */     
/*   */     @NotNull
/*   */     public final UUID component1() {
/*   */       return this.uuid;
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public final Timestamp component2() {
/*   */       return this.registration;
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public final Plain copy(@NotNull UUID uuid, @NotNull Timestamp registration) {
/*   */       Intrinsics.checkNotNullParameter(uuid, "uuid");
/*   */       Intrinsics.checkNotNullParameter(registration, "registration");
/*   */       return new Plain(uuid, registration);
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public String toString() {
/*   */       return "Plain(uuid=" + this.uuid + ", registration=" + this.registration + ")";
/*   */     }
/*   */     
/*   */     public int hashCode() {
/*   */       result = this.uuid.hashCode();
/*   */       return result * 31 + this.registration.hashCode();
/*   */     }
/*   */     
/*   */     public boolean equals(@Nullable Object other) {
/*   */       if (this == other)
/*   */         return true; 
/*   */       if (!(other instanceof Plain))
/*   */         return false; 
/*   */       Plain plain = (Plain)other;
/*   */       return !Intrinsics.areEqual(this.uuid, plain.uuid) ? false : (!!Intrinsics.areEqual(this.registration, plain.registration));
/*   */     } }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-auth-jvm-0.4.32.jar!\ai\grazie\model\auth\GrazieUser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */