/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\000 \0322\0020\001:\001\032B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\r\032\0020\003HÆ\003J\020\020\016\032\0020\005HÆ\003¢\006\004\b\017\020\013J$\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001¢\006\004\b\021\020\022J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\027HÖ\001J\t\020\030\032\0020\031HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\0020\005¢\006\n\n\002\020\f\032\004\b\n\020\013¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "", "origin", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthOrigin;", "requestHeaders", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthOrigin;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOrigin", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthOrigin;", "getRequestHeaders-yd9Q308", "()Ljava/util/Map;", "Ljava/util/Map;", "component1", "component2", "component2-yd9Q308", "copy", "copy-P03y53I", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthOrigin;Ljava/util/Map;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "data.model"})
/*    */ public final class GrazieAuthData { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final GrazieAuthOrigin origin;
/*    */   @NotNull
/*    */   private final Map<String, ? extends String> requestHeaders;
/*    */   
/*  8 */   private GrazieAuthData(GrazieAuthOrigin origin, Map<String, ? extends String> requestHeaders) { this.origin = origin;
/*    */ 
/*    */     
/* 11 */     this.requestHeaders = requestHeaders; } @NotNull public final GrazieAuthOrigin getOrigin() { return this.origin; } @NotNull public final GrazieAuthOrigin component1() { return this.origin; } @NotNull public final Map<String, ? extends String> component2-yd9Q308() { return this.requestHeaders; } @NotNull public final GrazieAuthData copy-P03y53I(@NotNull GrazieAuthOrigin origin, @NotNull Map requestHeaders) { Intrinsics.checkNotNullParameter(origin, "origin"); Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders"); return new GrazieAuthData(origin, requestHeaders, null); } @NotNull public final Map<String, ? extends String> getRequestHeaders-yd9Q308() { return this.requestHeaders; }
/*    */   @NotNull public String toString() { return "GrazieAuthData(origin=" + this.origin + ", requestHeaders=" + SimpleHttpHeaders.toString-impl(this.requestHeaders) + ")"; } public int hashCode() { result = this.origin.hashCode(); return result * 31 + SimpleHttpHeaders.hashCode-impl(this.requestHeaders); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof GrazieAuthData))
/*    */       return false;  GrazieAuthData grazieAuthData = (GrazieAuthData)other; return (this.origin != grazieAuthData.origin) ? false : (!!SimpleHttpHeaders.equals-impl0(this.requestHeaders, grazieAuthData.requestHeaders)); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\035\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t¢\006\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData$Companion;", "", "<init>", "()V", "forGrazieJwtAuth", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "origin", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthOrigin;", "authJwt", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthJwt;", "forGrazieJwtAuth-B-TJSaM", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthOrigin;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "data.model"}) public static final class Companion
/*    */   {
/* 15 */     @NotNull public final GrazieAuthData forGrazieJwtAuth-B-TJSaM(@NotNull GrazieAuthOrigin origin, @NotNull String authJwt) { Intrinsics.checkNotNullParameter(origin, "origin"); Intrinsics.checkNotNullParameter(authJwt, "authJwt");
/*    */ 
/*    */       
/* 18 */       Pair[] arrayOfPair = new Pair[2]; arrayOfPair[0] = TuplesKt.to("Grazie-Authenticate-JWT", authJwt); arrayOfPair[1] = 
/* 19 */         GrazieAgentKt.getGrazieAgentHeader();
/*    */       return new GrazieAuthData(origin, SimpleHttpHeaders.Companion.of-vDDv_S8((Pair<String, String>[])arrayOfPair), null); }
/*    */ 
/*    */     
/*    */     private Companion() {}
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\GrazieAuthData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */