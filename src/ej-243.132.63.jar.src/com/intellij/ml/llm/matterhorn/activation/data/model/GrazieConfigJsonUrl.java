/*   */ package com.intellij.ml.llm.matterhorn.activation.data.model;@JvmInline
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\002\b@\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003¢\006\004\b\f\020\rJ\020\020\016\032\0020\017HÖ\001¢\006\004\b\020\020\021J\020\020\022\032\0020\023HÖ\001¢\006\004\b\024\020\005R\023\020\002\032\0020\003¢\006\n\n\002\020\b\032\004\b\006\020\007\001\002¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieConfigJsonUrl;", "", "url", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/RegionUrl;", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getUrl-VLHUAj8", "()Ljava/lang/String;", "Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "", "toString-impl", "data.model"})
/*   */ public final class GrazieConfigJsonUrl { @NotNull
/* 4 */   public final String getUrl-VLHUAj8() { return this.url; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   private final String url;
/*   */   
/*   */   public static String toString-impl(String arg0) {
/*   */     return "GrazieConfigJsonUrl(url=" + RegionUrl.toString-impl(arg0) + ")";
/*   */   }
/*   */   
/*   */   public String toString() {
/*   */     return toString-impl(this.url);
/*   */   }
/*   */   
/*   */   public static int hashCode-impl(String arg0) {
/*   */     return RegionUrl.hashCode-impl(arg0);
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return hashCode-impl(this.url);
/*   */   }
/*   */   
/*   */   public static boolean equals-impl(String arg0, Object other) {
/*   */     return !(other instanceof GrazieConfigJsonUrl) ? false : (!!RegionUrl.equals-impl0(arg0, ((GrazieConfigJsonUrl)other).unbox-impl()));
/*   */   }
/*   */   
/*   */   public boolean equals(Object other) {
/*   */     return equals-impl(this.url, other);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public static String constructor-impl(@NotNull String url) {
/*   */     Intrinsics.checkNotNullParameter(url, "url");
/*   */     return url;
/*   */   }
/*   */   
/*   */   public static final boolean equals-impl0(String p1, String p2) {
/*   */     return RegionUrl.equals-impl0(p1, p2);
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\GrazieConfigJsonUrl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */