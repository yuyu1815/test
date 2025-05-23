/*    */ package androidx.compose.ui.text;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated(message = "Use LinkAnnotatation.Url(url) instead", replaceWith = @ReplaceWith(expression = "LinkAnnotation.Url(url)", imports = {}))
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\004\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\001H\002J\b\020\n\032\0020\013H\026J\b\020\f\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\r"}, d2 = {"Landroidx/compose/ui/text/UrlAnnotation;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "ui-text"})
/*    */ @ExperimentalTextApi
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class UrlAnnotation
/*    */ {
/*    */   @NotNull
/*    */   private final String url;
/*    */   public static final int $stable;
/*    */   
/*    */   public UrlAnnotation(@NotNull String url) {
/* 33 */     this.url = url; } @NotNull public final String getUrl() { return this.url; }
/*    */    public boolean equals(@Nullable Object other) {
/* 35 */     if (this == other) return true; 
/* 36 */     if (!(other instanceof UrlAnnotation)) return false; 
/* 37 */     if (!Intrinsics.areEqual(this.url, ((UrlAnnotation)other).url)) return false; 
/* 38 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 42 */     return this.url.hashCode();
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 46 */     return "UrlAnnotation(url=" + this.url + ')';
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\UrlAnnotation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */