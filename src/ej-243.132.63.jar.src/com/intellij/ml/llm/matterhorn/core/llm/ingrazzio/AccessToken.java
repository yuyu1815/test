/*    */ package com.intellij.ml.llm.matterhorn.core.llm.ingrazzio;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\005\n\002\020\t\n\002\b\004\n\002\030\002\n\002\b\025\n\002\020\013\n\002\b\017\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 >2\0020\001:\002=>BE\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003\022\b\020\n\032\004\030\0010\013¢\006\004\b\f\020\rB_\b\020\022\006\020\016\032\0020\005\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\003\022\b\020\007\032\004\030\0010\003\022\b\020\b\032\004\030\0010\003\022\b\020\t\032\004\030\0010\003\022\b\020\n\032\004\030\0010\013\022\b\020\017\032\004\030\0010\020¢\006\004\b\f\020\021J\006\020%\032\0020&J\006\020'\032\0020\003J\t\020(\032\0020\003HÆ\003J\t\020)\032\0020\005HÆ\003J\013\020*\032\004\030\0010\003HÆ\003J\t\020+\032\0020\003HÆ\003J\t\020,\032\0020\003HÆ\003J\t\020-\032\0020\003HÆ\003J\020\020.\032\004\030\0010\013HÆ\003¢\006\002\020#JX\020/\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0032\b\b\002\020\007\032\0020\0032\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\0032\n\b\002\020\n\032\004\030\0010\013HÆ\001¢\006\002\0200J\023\0201\032\0020&2\b\0202\032\004\030\0010\001HÖ\003J\t\0203\032\0020\005HÖ\001J\t\0204\032\0020\003HÖ\001J%\0205\032\002062\006\0207\032\0020\0002\006\0208\032\002092\006\020:\032\0020;H\001¢\006\002\b<R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\022\020\023\032\004\b\024\020\025R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\026\020\023\032\004\b\027\020\030R\036\020\006\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\031\020\023\032\004\b\032\020\025R\034\020\007\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\033\020\023\032\004\b\034\020\025R\034\020\b\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\035\020\023\032\004\b\036\020\025R\034\020\t\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\037\020\023\032\004\b \020\025R \020\n\032\004\030\0010\0138\006X\004¢\006\020\n\002\020$\022\004\b!\020\023\032\004\b\"\020#¨\006?"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "", "accessToken", "", "expiresIn", "", "refreshToken", "scope", "tokenType", "idToken", "creationTime", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccessToken$annotations", "()V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn$annotations", "getExpiresIn", "()I", "getRefreshToken$annotations", "getRefreshToken", "getScope$annotations", "getScope", "getTokenType$annotations", "getTokenType", "getIdToken$annotations", "getIdToken", "getCreationTime$annotations", "getCreationTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "isExpired", "", "getAuthorizationHeaderValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AccessToken {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String accessToken;
/*    */   private final int expiresIn;
/*    */   @Nullable
/*    */   private final String refreshToken;
/*    */   @NotNull
/*    */   private final String scope;
/*    */   @NotNull
/*    */   private final String tokenType;
/*    */   @NotNull
/*    */   private final String idToken;
/*    */   @Nullable
/*    */   private final Long creationTime;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "core-llm"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<AccessToken> serializer() {
/* 35 */       return (KSerializer<AccessToken>)AccessToken.$serializer.INSTANCE;
/*    */     } private Companion() {} }
/*    */   public AccessToken(@NotNull String accessToken, int expiresIn, @Nullable String refreshToken, @NotNull String scope, @NotNull String tokenType, @NotNull String idToken, @Nullable Long creationTime) {
/* 38 */     this.accessToken = accessToken;
/*    */ 
/*    */     
/* 41 */     this.expiresIn = expiresIn;
/*    */ 
/*    */     
/* 44 */     this.refreshToken = refreshToken;
/*    */ 
/*    */     
/* 47 */     this.scope = scope;
/*    */ 
/*    */     
/* 50 */     this.tokenType = tokenType;
/*    */ 
/*    */     
/* 53 */     this.idToken = idToken;
/*    */ 
/*    */     
/* 56 */     this.creationTime = creationTime; } @NotNull public final String getAccessToken() { return this.accessToken; } public final int getExpiresIn() { return this.expiresIn; } @Nullable public final String getRefreshToken() { return this.refreshToken; } @Nullable public final Long getCreationTime() { return this.creationTime; } @NotNull public final String getScope() { return this.scope; }
/*    */   @NotNull
/*    */   public final String getTokenType() { return this.tokenType; }
/*    */   @NotNull
/*    */   public final String getIdToken() { return this.idToken; }
/* 61 */   public final boolean isExpired() { return (System.currentTimeMillis() >= ((this.creationTime != null) ? this.creationTime.longValue() : 0L) + (this.expiresIn * 1000)); }
/*    */   
/*    */   @NotNull
/*    */   public final String getAuthorizationHeaderValue() {
/* 65 */     return 
/* 66 */       Intrinsics.areEqual(this.tokenType, "GITHUB_ACCESS_TOKEN_TYPE") ? ("GitHub " + this.idToken) : ("Bearer " + 
/* 67 */       this.idToken);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.accessToken;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.expiresIn;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.refreshToken;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.scope;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component5() {
/*    */     return this.tokenType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component6() {
/*    */     return this.idToken;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Long component7() {
/*    */     return this.creationTime;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AccessToken copy(@NotNull String accessToken, int expiresIn, @Nullable String refreshToken, @NotNull String scope, @NotNull String tokenType, @NotNull String idToken, @Nullable Long creationTime) {
/*    */     Intrinsics.checkNotNullParameter(accessToken, "accessToken");
/*    */     Intrinsics.checkNotNullParameter(scope, "scope");
/*    */     Intrinsics.checkNotNullParameter(tokenType, "tokenType");
/*    */     Intrinsics.checkNotNullParameter(idToken, "idToken");
/*    */     return new AccessToken(accessToken, expiresIn, refreshToken, scope, tokenType, idToken, creationTime);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AccessToken(accessToken=" + this.accessToken + ", expiresIn=" + this.expiresIn + ", refreshToken=" + this.refreshToken + ", scope=" + this.scope + ", tokenType=" + this.tokenType + ", idToken=" + this.idToken + ", creationTime=" + this.creationTime + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.accessToken.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.expiresIn);
/*    */     result = result * 31 + ((this.refreshToken == null) ? 0 : this.refreshToken.hashCode());
/*    */     result = result * 31 + this.scope.hashCode();
/*    */     result = result * 31 + this.tokenType.hashCode();
/*    */     result = result * 31 + this.idToken.hashCode();
/*    */     return result * 31 + ((this.creationTime == null) ? 0 : this.creationTime.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AccessToken))
/*    */       return false; 
/*    */     AccessToken accessToken = (AccessToken)other;
/*    */     return !Intrinsics.areEqual(this.accessToken, accessToken.accessToken) ? false : ((this.expiresIn != accessToken.expiresIn) ? false : (!Intrinsics.areEqual(this.refreshToken, accessToken.refreshToken) ? false : (!Intrinsics.areEqual(this.scope, accessToken.scope) ? false : (!Intrinsics.areEqual(this.tokenType, accessToken.tokenType) ? false : (!Intrinsics.areEqual(this.idToken, accessToken.idToken) ? false : (!!Intrinsics.areEqual(this.creationTime, accessToken.creationTime)))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\ingrazzio\AccessToken.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */