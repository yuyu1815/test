/*   */ package ai.grazie.auth.model;
/*   */ 
/*   */ import ai.grazie.utils.mpp.UUID;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\017HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lai/grazie/auth/model/GrazieUser;", "", "uid", "Lai/grazie/utils/mpp/UUID;", "(Lai/grazie/utils/mpp/UUID;)V", "getUid", "()Lai/grazie/utils/mpp/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "auth-model"})
/*   */ public final class GrazieUser {
/* 7 */   public GrazieUser(@NotNull UUID uid) { this.uid = uid; } @NotNull private final UUID uid; @NotNull public final UUID getUid() { return this.uid; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final UUID component1() {
/*   */     return this.uid;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final GrazieUser copy(@NotNull UUID uid) {
/*   */     Intrinsics.checkNotNullParameter(uid, "uid");
/*   */     return new GrazieUser(uid);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "GrazieUser(uid=" + this.uid + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return this.uid.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof GrazieUser))
/*   */       return false; 
/*   */     GrazieUser grazieUser = (GrazieUser)other;
/*   */     return !!Intrinsics.areEqual(this.uid, grazieUser.uid);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\GrazieUser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */