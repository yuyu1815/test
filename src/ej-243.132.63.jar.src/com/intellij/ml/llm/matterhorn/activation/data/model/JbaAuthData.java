/*   */ package com.intellij.ml.llm.matterhorn.activation.data.model;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\000 \0322\0020\001:\001\032B\031\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007J\t\020\r\032\0020\003HÆ\003J\022\020\016\032\004\030\0010\005HÆ\003¢\006\004\b\017\020\013J&\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001¢\006\004\b\021\020\022J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\027HÖ\001J\t\020\030\032\0020\031HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\025\020\004\032\004\030\0010\005¢\006\n\n\002\020\f\032\004\b\n\020\013¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;", "", "user", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;", "idToken", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaIdToken;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getUser", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;", "getIdToken-9HrtA_0", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component2", "component2-9HrtA_0", "copy", "copy-N05Uq8U", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "data.model"})
/*   */ public final class JbaAuthData { @NotNull
/* 4 */   public static final Companion Companion = new Companion(null); private JbaAuthData(JbaUser user, String idToken) { this.user = user;
/* 5 */     this.idToken = idToken; } @NotNull private final JbaUser user; @Nullable private final String idToken; @NotNull public final JbaUser getUser() { return this.user; } @Nullable public final String getIdToken-9HrtA_0() { return this.idToken; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final JbaUser component1() {
/*   */     return this.user;
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public final String component2-9HrtA_0() {
/*   */     return this.idToken;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final JbaAuthData copy-N05Uq8U(@NotNull JbaUser user, @Nullable String idToken) {
/*   */     Intrinsics.checkNotNullParameter(user, "user");
/*   */     return new JbaAuthData(user, idToken, null);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "JbaAuthData(user=" + this.idToken + ", idToken=" + ((this.idToken == null) ? "null" : JbaIdToken.toString-impl(this.idToken)) + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.user.hashCode();
/*   */     return result * 31 + ((this.idToken == null) ? 0 : JbaIdToken.hashCode-impl(this.idToken));
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof JbaAuthData))
/*   */       return false; 
/*   */     JbaAuthData jbaAuthData = (JbaAuthData)other;
/*   */     if (!Intrinsics.areEqual(this.user, jbaAuthData.user))
/*   */       return false; 
/*   */     String str1 = this.idToken;
/*   */     String str2 = jbaAuthData.idToken;
/*   */     return !!((str1 == null) ? ((str2 == null) ? 1 : 0) : ((str2 == null) ? 0 : JbaIdToken.equals-impl0(str1, str2)));
/*   */   }
/*   */   
/*   */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData$Companion;", "", "<init>", "()V", "data.model"})
/*   */   public static final class Companion {
/*   */     private Companion() {}
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\JbaAuthData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */