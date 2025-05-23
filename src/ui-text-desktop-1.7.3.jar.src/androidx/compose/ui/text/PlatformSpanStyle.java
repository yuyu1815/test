/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\b\007\030\000 \0162\0020\001:\001\016B\007\b\026¢\006\002\020\002B\021\b\007\022\b\020\003\032\004\030\0010\004¢\006\002\020\005J\023\020\b\032\0020\t2\b\020\n\032\004\030\0010\001H\002J\b\020\013\032\0020\fH\026J\020\020\r\032\0020\0002\b\020\n\032\004\030\0010\000R\031\020\003\032\004\030\0010\004ø\001\000ø\001\001¢\006\b\n\000\032\004\b\006\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\017"}, d2 = {"Landroidx/compose/ui/text/PlatformSpanStyle;", "", "()V", "textDecorationLineStyle", "Landroidx/compose/ui/text/TextDecorationLineStyle;", "(Landroidx/compose/ui/text/TextDecorationLineStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTextDecorationLineStyle-Gch4ia8", "()Landroidx/compose/ui/text/TextDecorationLineStyle;", "equals", "", "other", "hashCode", "", "merge", "Companion", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class PlatformSpanStyle
/*     */ {
/*     */   private PlatformSpanStyle(TextDecorationLineStyle textDecorationLineStyle) {
/* 120 */     this.textDecorationLineStyle = textDecorationLineStyle; } @Nullable public final TextDecorationLineStyle getTextDecorationLineStyle-Gch4ia8() { return this.textDecorationLineStyle; }
/*     */   
/*     */   public PlatformSpanStyle() {
/* 123 */     this(null, null);
/*     */   } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Landroidx/compose/ui/text/PlatformSpanStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/PlatformSpanStyle;", "getDefault", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "ui-text"})
/*     */   public static final class Companion {
/*     */     @NotNull
/* 127 */     public final PlatformSpanStyle getDefault() { return PlatformSpanStyle.Default; } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); @Nullable private final TextDecorationLineStyle textDecorationLineStyle; public static final int $stable; @NotNull private static final PlatformSpanStyle Default = new PlatformSpanStyle();
/*     */   
/*     */   @NotNull
/*     */   public final PlatformSpanStyle merge(@Nullable PlatformSpanStyle other) {
/* 131 */     return this;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 135 */     if (this == other) return true; 
/* 136 */     if (!(other instanceof PlatformSpanStyle)) return false; 
/* 137 */     if (!Intrinsics.areEqual(this.textDecorationLineStyle, ((PlatformSpanStyle)other).textDecorationLineStyle)) return false; 
/* 138 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 142 */     return (this.textDecorationLineStyle != null) ? this.textDecorationLineStyle.hashCode() : 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\PlatformSpanStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */