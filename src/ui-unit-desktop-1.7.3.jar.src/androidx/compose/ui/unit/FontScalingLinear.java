/*    */ package androidx.compose.ui.unit;
/*    */ 
/*    */ import androidx.annotation.RestrictTo;
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\006\bg\030\0002\0020\001J\026\020\b\032\0020\t*\0020\nH\027ø\001\000¢\006\004\b\013\020\fJ\026\020\r\032\0020\n*\0020\tH\027ø\001\000¢\006\004\b\016\020\017R\032\020\002\032\0020\0038&X§\004¢\006\f\022\004\b\004\020\005\032\004\b\006\020\007ø\001\001\002\r\n\005\b¡\0360\001\n\004\b!0\001¨\006\020À\006\003"}, d2 = {"Landroidx/compose/ui/unit/FontScalingLinear;", "", "fontScale", "", "getFontScale$annotations", "()V", "getFontScale", "()F", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "toSp", "toSp-0xMU5do", "(F)J", "ui-unit"})
/*    */ @Immutable
/*    */ @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/*    */ @SourceDebugExtension({"SMAP\nFontScaling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.kt\nandroidx/compose/ui/unit/FontScalingLinear\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
/*    */ public interface FontScalingLinear
/*    */ {
/*    */   @Stable
/*    */   default long toSp-0xMU5do(float $this$toSp_u2d0xMU5do) {
/* 72 */     return TextUnitKt.getSp($this$toSp_u2d0xMU5do / getFontScale()); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated @Stable public static long toSp-0xMU5do(@NotNull FontScalingLinear $this, float $receiver) { return $this.toSp-0xMU5do($receiver); }
/*    */ 
/*    */ 
/*    */     
/*    */     @Deprecated
/*    */     @Stable
/*    */     public static float toDp-GaN1DYA(@NotNull FontScalingLinear $this, long $receiver) {
/* 79 */       return $this.toDp-GaN1DYA($receiver); } } @Stable
/* 80 */   default float toDp-GaN1DYA(long $this$toDp_u2dGaN1DYA) { if (!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA($this$toDp_u2dGaN1DYA), TextUnitType.Companion.getSp-UIouoOA())) {
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 85 */       int $i$a$-check-FontScalingLinear$toDp$1 = 0;
/*    */       String str = "Only Sp can convert to Px";
/*    */       throw new IllegalStateException(str.toString());
/*    */     } 
/*    */     return Dp.constructor-impl(TextUnit.getValue-impl($this$toDp_u2dGaN1DYA) * getFontScale()); }
/*    */ 
/*    */   
/*    */   float getFontScale();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\FontScalingLinear.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */