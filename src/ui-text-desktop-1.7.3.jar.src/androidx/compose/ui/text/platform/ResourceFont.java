/*    */ package androidx.compose.ui.text.platform;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.text.ExperimentalTextApi;
/*    */ import androidx.compose.ui.text.font.FontLoadingStrategy;
/*    */ import androidx.compose.ui.text.font.FontStyle;
/*    */ import androidx.compose.ui.text.font.FontWeight;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B#\b\000\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\032H\002J\b\020\033\032\0020\034H\026J\b\020\035\032\0020\003H\026R\024\020\t\032\0020\0038VX\004¢\006\006\032\004\b\n\020\013R$\020\f\032\0020\r8\026X\004ø\001\000ø\001\001¢\006\020\n\002\020\022\022\004\b\016\020\017\032\004\b\020\020\021R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\023\020\013R\034\020\006\032\0020\007X\004ø\001\000ø\001\001¢\006\n\n\002\020\022\032\004\b\024\020\021R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\025\020\026\002\013\n\005\b¡\0360\001\n\002\b!¨\006\036"}, d2 = {"Landroidx/compose/ui/text/platform/ResourceFont;", "Landroidx/compose/ui/text/platform/PlatformFont;", "name", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "identity", "getIdentity", "()Ljava/lang/String;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "getLoadingStrategy-PKNRLFQ", "()I", "I", "getName", "getStyle-_-LCdwA", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "equals", "", "other", "", "hashCode", "", "toString", "ui-text"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class ResourceFont
/*    */   extends PlatformFont
/*    */ {
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final FontWeight weight;
/*    */   private final int style;
/*    */   private final int loadingStrategy;
/*    */   public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public final String getName() {
/* 48 */     return this.name; } @NotNull
/* 49 */   public FontWeight getWeight() { return this.weight; }
/* 50 */   public int getStyle-_-LCdwA() { return this.style; }
/* 51 */   private ResourceFont(String name, FontWeight weight, int style) { super(null);
/*    */     
/*    */     this.name = name;
/*    */     this.weight = weight;
/*    */     this.style = style;
/* 56 */     this.loadingStrategy = FontLoadingStrategy.Companion.getBlocking-PKNRLFQ(); } public int getLoadingStrategy-PKNRLFQ() { return this.loadingStrategy; }
/*    */   @NotNull
/*    */   public String getIdentity() { return this.name; } public boolean equals(@Nullable Object other) {
/* 59 */     if (this == other) return true; 
/* 60 */     if (!Intrinsics.areEqual(getClass(), (other != null) ? other.getClass() : null)) return false;
/*    */     
/* 62 */     Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.ui.text.platform.ResourceFont"); (ResourceFont)other;
/*    */     
/* 64 */     if (!Intrinsics.areEqual(this.name, ((ResourceFont)other).name)) return false; 
/* 65 */     if (!Intrinsics.areEqual(getWeight(), ((ResourceFont)other).getWeight())) return false; 
/* 66 */     return FontStyle.equals-impl0(getStyle-_-LCdwA(), ((ResourceFont)other).getStyle-_-LCdwA());
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 70 */     int result = this.name.hashCode();
/* 71 */     result = 31 * result + getWeight().hashCode();
/* 72 */     result = 31 * result + FontStyle.hashCode-impl(getStyle-_-LCdwA());
/* 73 */     return result;
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 77 */     return "ResourceFont(name='" + this.name + "', weight=" + getWeight() + ", style=" + FontStyle.toString-impl(getStyle-_-LCdwA()) + ')';
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\ResourceFont.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */