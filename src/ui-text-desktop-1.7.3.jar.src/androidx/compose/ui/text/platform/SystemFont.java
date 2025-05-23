/*    */ package androidx.compose.ui.text.platform;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.text.ExperimentalTextApi;
/*    */ import androidx.compose.ui.text.font.FontStyle;
/*    */ import androidx.compose.ui.text.font.FontWeight;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\b\007\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\b\020\020\032\0020\003H\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\nR\034\020\006\032\0020\007X\004ø\001\000ø\001\001¢\006\n\n\002\020\r\032\004\b\013\020\fR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\016\020\017\002\013\n\005\b¡\0360\001\n\002\b!¨\006\021"}, d2 = {"Landroidx/compose/ui/text/platform/SystemFont;", "Landroidx/compose/ui/text/platform/PlatformFont;", "identity", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIdentity", "()Ljava/lang/String;", "getStyle-_-LCdwA", "()I", "I", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "toString", "ui-text"})
/*    */ @ExperimentalTextApi
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class SystemFont
/*    */   extends PlatformFont
/*    */ {
/*    */   @NotNull
/*    */   private final String identity;
/*    */   @NotNull
/*    */   private final FontWeight weight;
/*    */   private final int style;
/*    */   public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public String getIdentity() {
/* 57 */     return this.identity; } @NotNull
/* 58 */   public FontWeight getWeight() { return this.weight; }
/* 59 */   public int getStyle-_-LCdwA() { return this.style; }
/* 60 */   private SystemFont(String identity, FontWeight weight, int style) { super(null); this.identity = identity;
/*    */     this.weight = weight;
/* 62 */     this.style = style; } @NotNull public String toString() { return "SystemFont(identity='" + getIdentity() + "', weight=" + getWeight() + ", style=" + FontStyle.toString-impl(getStyle-_-LCdwA()) + ')'; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\SystemFont.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */