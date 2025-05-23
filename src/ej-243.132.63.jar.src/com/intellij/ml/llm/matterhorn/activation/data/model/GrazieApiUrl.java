/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model;@JvmInline @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\004\b@\030\000 \0252\0020\001:\001\025B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\017\020\t\032\0020\nH\026¢\006\004\b\013\020\005J\032\020\f\032\0020\r2\b\020\016\032\004\030\0010\001HÖ\003¢\006\004\b\017\020\020J\020\020\021\032\0020\022HÖ\001¢\006\004\b\023\020\024R\023\020\002\032\0020\003¢\006\n\n\002\020\b\032\004\b\006\020\007\001\002¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;", "", "url", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/RegionUrl;", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getUrl-VLHUAj8", "()Ljava/lang/String;", "Ljava/lang/String;", "toString", "", "toString-impl", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "Companion", "data.model"}) public final class GrazieApiUrl { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final String url; @NotNull
/*  4 */   public final String getUrl-VLHUAj8() { return this.url; } @NotNull
/*  5 */   public static String toString-impl(String arg0) { return RegionUrl.toString-impl(arg0); } public static int hashCode-impl(String arg0) { return RegionUrl.hashCode-impl(arg0); } public int hashCode() { return hashCode-impl(this.url); } public static boolean equals-impl(String arg0, Object other) { return !(other instanceof GrazieApiUrl) ? false : (!!RegionUrl.equals-impl0(arg0, ((GrazieApiUrl)other).unbox-impl())); } @NotNull public String toString() { return toString-impl(this.url); }
/*    */   public boolean equals(Object other) { return equals-impl(this.url, other); } @NotNull
/*    */   public static String constructor-impl(@NotNull String url) { Intrinsics.checkNotNullParameter(url, "url");
/*    */     return url; } public static final boolean equals-impl0(String p1, String p2) { return RegionUrl.equals-impl0(p1, p2); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\025\020\004\032\0020\0052\006\020\006\032\0020\007¢\006\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl$Companion;", "", "<init>", "()V", "fromResolvedUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;", "url", "", "fromResolvedUrl-kmrddwU", "(Ljava/lang/String;)Ljava/lang/String;", "data.model"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/* 12 */     public final String fromResolvedUrl-kmrddwU(@NotNull String url) { Intrinsics.checkNotNullParameter(url, "url"); return GrazieApiUrl.constructor-impl(RegionUrl.constructor-impl(url)); }
/*    */ 
/*    */     
/*    */     private Companion() {}
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\GrazieApiUrl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */