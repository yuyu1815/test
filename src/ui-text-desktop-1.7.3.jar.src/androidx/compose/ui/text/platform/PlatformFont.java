/*    */ package androidx.compose.ui.text.platform;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.text.font.Font;
/*    */ import androidx.compose.ui.text.font.FontStyle;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001B\007\b\004¢\006\002\020\002R\024\020\003\032\0020\0048@X\004¢\006\006\032\004\b\005\020\006R\022\020\007\032\0020\004X¦\004¢\006\006\032\004\b\b\020\006\001\004\t\n\013\f¨\006\r"}, d2 = {"Landroidx/compose/ui/text/platform/PlatformFont;", "Landroidx/compose/ui/text/font/Font;", "()V", "cacheKey", "", "getCacheKey$ui_text", "()Ljava/lang/String;", "identity", "getIdentity", "Landroidx/compose/ui/text/platform/FileFont;", "Landroidx/compose/ui/text/platform/LoadedFont;", "Landroidx/compose/ui/text/platform/ResourceFont;", "Landroidx/compose/ui/text/platform/SystemFont;", "ui-text"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public abstract class PlatformFont
/*    */   implements Font
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   private PlatformFont() {}
/*    */   
/*    */   @NotNull
/*    */   public abstract String getIdentity();
/*    */   
/*    */   @NotNull
/*    */   public final String getCacheKey$ui_text() {
/* 31 */     return Reflection.getOrCreateKotlinClass(getClass()).getQualifiedName() + '|' + getIdentity() + "|weight=" + getWeight().getWeight() + "|style=" + FontStyle.toString-impl(getStyle-_-LCdwA());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\PlatformFont.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */