/*   */ package com.intellij.ml.llm.matterhorn.activation.data.model;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\023\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\b\b\030\000 \0362\0020\001:\001\036B+\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005¢\006\004\b\b\020\tJ\020\020\020\032\0020\003HÆ\003¢\006\004\b\021\020\013J\t\020\022\032\0020\005HÆ\003J\013\020\023\032\004\030\0010\005HÆ\003J\013\020\024\032\004\030\0010\005HÆ\003J<\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0052\n\b\002\020\007\032\004\030\0010\005HÆ\001¢\006\004\b\026\020\027J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\034HÖ\001J\t\020\035\032\0020\005HÖ\001R\023\020\002\032\0020\003¢\006\n\n\002\020\f\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\013R\023\020\006\032\004\030\0010\005¢\006\b\n\000\032\004\b\016\020\013R\023\020\007\032\004\030\0010\005¢\006\b\n\000\032\004\b\017\020\013¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;", "", "userId", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUserId;", "login", "", "email", "presentableName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getUserId-cfj0yrU", "()Ljava/lang/String;", "Ljava/lang/String;", "getLogin", "getEmail", "getPresentableName", "component1", "component1-cfj0yrU", "component2", "component3", "component4", "copy", "copy-IsJDdfA", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;", "equals", "", "other", "hashCode", "", "toString", "Companion", "data.model"})
/*   */ public final class JbaUser { @NotNull
/*   */   public static final Companion Companion = new Companion(null); @NotNull
/* 5 */   private final String userId; private JbaUser(String userId, String login, String email, String presentableName) { this.userId = userId;
/* 6 */     this.login = login;
/* 7 */     this.email = email;
/* 8 */     this.presentableName = presentableName; } @NotNull private final String login; @Nullable private final String email; @Nullable private final String presentableName; @NotNull public final String getUserId-cfj0yrU() { return this.userId; } @Nullable public final String getPresentableName() { return this.presentableName; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final String getLogin() {
/*   */     return this.login;
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public final String getEmail() {
/*   */     return this.email;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String component1-cfj0yrU() {
/*   */     return this.userId;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String component2() {
/*   */     return this.login;
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public final String component3() {
/*   */     return this.email;
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public final String component4() {
/*   */     return this.presentableName;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final JbaUser copy-IsJDdfA(@NotNull String userId, @NotNull String login, @Nullable String email, @Nullable String presentableName) {
/*   */     Intrinsics.checkNotNullParameter(userId, "userId");
/*   */     Intrinsics.checkNotNullParameter(login, "login");
/*   */     return new JbaUser(userId, login, email, presentableName, null);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "JbaUser(userId=" + JbaUserId.toString-impl(this.userId) + ", login=" + this.login + ", email=" + this.email + ", presentableName=" + this.presentableName + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = JbaUserId.hashCode-impl(this.userId);
/*   */     result = result * 31 + this.login.hashCode();
/*   */     result = result * 31 + ((this.email == null) ? 0 : this.email.hashCode());
/*   */     return result * 31 + ((this.presentableName == null) ? 0 : this.presentableName.hashCode());
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof JbaUser))
/*   */       return false; 
/*   */     JbaUser jbaUser = (JbaUser)other;
/*   */     return !JbaUserId.equals-impl0(this.userId, jbaUser.userId) ? false : (!Intrinsics.areEqual(this.login, jbaUser.login) ? false : (!Intrinsics.areEqual(this.email, jbaUser.email) ? false : (!!Intrinsics.areEqual(this.presentableName, jbaUser.presentableName))));
/*   */   }
/*   */   
/*   */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser$Companion;", "", "<init>", "()V", "data.model"})
/*   */   public static final class Companion {
/*   */     private Companion() {}
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\JbaUser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */