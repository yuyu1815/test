/*     */ package androidx.compose.ui.text.style;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.SolidColor;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\b`\030\000 \0222\0020\001:\002\022\023J\020\020\016\032\0020\0002\006\020\017\032\0020\000H\026J\026\020\020\032\0020\0002\f\020\017\032\b\022\004\022\0020\0000\021H\026R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\024\020\006\032\004\030\0010\007X¦\004¢\006\006\032\004\b\b\020\tR\030\020\n\032\0020\013X¦\004ø\001\000ø\001\001¢\006\006\032\004\b\f\020\rø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006\024À\006\001"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", "", "alpha", "", "getAlpha", "()F", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "merge", "other", "takeOrElse", "Lkotlin/Function0;", "Companion", "Unspecified", "ui-text"})
/*     */ public interface TextForegroundStyle
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   
/*     */   long getColor-0d7_KjU();
/*     */   
/*     */   @Nullable
/*     */   Brush getBrush();
/*     */   
/*     */   float getAlpha();
/*     */   
/*     */   @NotNull
/*     */   default TextForegroundStyle merge(@NotNull TextForegroundStyle other) {
/*  52 */     Intrinsics.checkNotNullParameter(other, "other"); return (
/*  53 */       other instanceof BrushStyle && this instanceof BrushStyle) ? 
/*  54 */       new BrushStyle(((BrushStyle)other).getValue(), TextDrawStyleKt.access$takeOrElse(other.getAlpha(), new TextForegroundStyle$merge$1())) : (
/*  55 */       (other instanceof BrushStyle && !(this instanceof BrushStyle)) ? other : (
/*  56 */       (!(other instanceof BrushStyle) && this instanceof BrushStyle) ? this : 
/*  57 */       other.takeOrElse(new TextForegroundStyle$merge$2()))); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\007\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}) static final class TextForegroundStyle$merge$1 extends Lambda implements Function0<Float> { TextForegroundStyle$merge$1() { super(0); } @NotNull public final Float invoke() { return Float.valueOf(TextForegroundStyle.this.getAlpha()); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "invoke"}) static final class TextForegroundStyle$merge$2 extends Lambda implements Function0<TextForegroundStyle> { @NotNull public final TextForegroundStyle invoke() { return TextForegroundStyle.this; }
/*     */      TextForegroundStyle$merge$2() {
/*     */       super(0);
/*     */     } } @NotNull
/*     */   default TextForegroundStyle takeOrElse(@NotNull Function0 other) {
/*  62 */     Intrinsics.checkNotNullParameter(other, "other"); return !Intrinsics.areEqual(this, Unspecified.INSTANCE) ? this : (TextForegroundStyle)other.invoke();
/*     */   } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006R\026\020\007\032\004\030\0010\b8VX\004¢\006\006\032\004\b\t\020\nR\032\020\013\032\0020\f8VX\004ø\001\000ø\001\001¢\006\006\032\004\b\r\020\016\002\013\n\005\b¡\0360\001\n\002\b!¨\006\017"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle$Unspecified;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "()V", "alpha", "", "getAlpha", "()F", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "ui-text"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class Unspecified implements TextForegroundStyle { @NotNull
/*     */     public static final Unspecified INSTANCE = new Unspecified(); public static final int $stable; public long getColor-0d7_KjU() {
/*  67 */       return Color.Companion.getUnspecified-0d7_KjU();
/*     */     } @Nullable
/*     */     public Brush getBrush() {
/*  70 */       return null;
/*     */     }
/*     */     public float getAlpha() {
/*  73 */       return Float.NaN;
/*     */     } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\003\032\0020\0042\b\020\005\032\004\030\0010\0062\006\020\007\032\0020\bJ\030\020\003\032\0020\0042\006\020\t\032\0020\nø\001\000¢\006\004\b\013\020\f\002\007\n\005\b¡\0360\001¨\006\r"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle$Companion;", "", "()V", "from", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "color", "Landroidx/compose/ui/graphics/Color;", "from-8_81llA", "(J)Landroidx/compose/ui/text/style/TextForegroundStyle;", "ui-text"})
/*     */   @SourceDebugExtension({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,150:1\n696#2:151\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n*L\n78#1:151\n*E\n"})
/*     */   public static final class Companion { @NotNull
/*     */     public final TextForegroundStyle from-8_81llA(long color) {
/*  78 */       long $this$isSpecified$iv = color; int $i$f$isSpecified-8_81llA = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 151 */         ($this$isSpecified$iv != 16L)) ? new ColorStyle(color, null) : TextForegroundStyle.Unspecified.INSTANCE;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final TextForegroundStyle from(@Nullable Brush brush, float alpha) {
/*     */       Brush brush1 = brush;
/*     */       if (brush1 instanceof androidx.compose.ui.graphics.ShaderBrush) {
/*     */       
/*     */       } else {
/*     */         throw new NoWhenBranchMatchedException();
/*     */       } 
/*     */       return (brush1 == null) ? TextForegroundStyle.Unspecified.INSTANCE : ((brush1 instanceof SolidColor) ? from-8_81llA(TextDrawStyleKt.modulate-DxMtmZc(((SolidColor)brush).getValue-0d7_KjU(), alpha)) : (TextForegroundStyle)"JD-Core does not support Kotlin");
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\TextForegroundStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */