/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.ExperimentalTextApi;
/*     */ import androidx.compose.ui.text.font.FontLoadingStrategy;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\020\022\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B-\b\000\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013J\023\020\034\032\0020\0352\b\020\036\032\004\030\0010\037H\002J\b\020 \032\0020!H\026J\b\020\"\032\0020\003H\026R\021\020\f\032\0020\0068F¢\006\006\032\004\b\004\020\rR\032\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\b\n\000\032\004\b\016\020\017R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\020\020\021R$\020\022\032\0020\0238\026X\004ø\001\000ø\001\001¢\006\020\n\002\020\030\022\004\b\024\020\025\032\004\b\026\020\027R\034\020\t\032\0020\nX\004ø\001\000ø\001\001¢\006\n\n\002\020\030\032\004\b\031\020\027R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\032\020\033\002\013\n\005\b¡\0360\001\n\002\b!¨\006#"}, d2 = {"Landroidx/compose/ui/text/platform/LoadedFont;", "Landroidx/compose/ui/text/platform/PlatformFont;", "identity", "", "getData", "Lkotlin/Function0;", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "data", "()[B", "getGetData$ui_text", "()Lkotlin/jvm/functions/Function0;", "getIdentity", "()Ljava/lang/String;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "getLoadingStrategy-PKNRLFQ", "()I", "I", "getStyle-_-LCdwA", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "equals", "", "other", "", "hashCode", "", "toString", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class LoadedFont
/*     */   extends PlatformFont
/*     */ {
/*     */   @NotNull
/*     */   private final String identity;
/*     */   @NotNull
/*     */   private final Function0<byte[]> getData;
/*     */   @NotNull
/*     */   private final FontWeight weight;
/*     */   private final int style;
/*     */   private final int loadingStrategy;
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public String getIdentity() {
/*  79 */     return this.identity; } @NotNull
/*  80 */   public final Function0<byte[]> getGetData$ui_text() { return this.getData; } @NotNull
/*  81 */   public FontWeight getWeight() { return this.weight; }
/*  82 */   public int getStyle-_-LCdwA() { return this.style; }
/*  83 */   private LoadedFont(String identity, Function0<byte[]> getData, FontWeight weight, int style) { super(null); this.identity = identity; this.getData = getData; this.weight = weight;
/*     */     this.style = style;
/*  85 */     this.loadingStrategy = FontLoadingStrategy.Companion.getBlocking-PKNRLFQ(); } public int getLoadingStrategy-PKNRLFQ() { return this.loadingStrategy; } @NotNull
/*     */   public final byte[] getData() {
/*  87 */     return (byte[])this.getData.invoke();
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/*  90 */     if (this == other) return true; 
/*  91 */     if (!(other instanceof LoadedFont)) return false; 
/*  92 */     if (!Intrinsics.areEqual(getIdentity(), ((LoadedFont)other).getIdentity())) return false; 
/*  93 */     if (!Intrinsics.areEqual(getWeight(), ((LoadedFont)other).getWeight())) return false; 
/*  94 */     return FontStyle.equals-impl0(getStyle-_-LCdwA(), ((LoadedFont)other).getStyle-_-LCdwA());
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  98 */     int result = getIdentity().hashCode();
/*  99 */     result = 31 * result + getWeight().hashCode();
/* 100 */     result = 31 * result + FontStyle.hashCode-impl(getStyle-_-LCdwA());
/* 101 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 105 */     return "LoadedFont(identity='" + getIdentity() + "', weight=" + getWeight() + ", style=" + FontStyle.toString-impl(getStyle-_-LCdwA()) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\LoadedFont.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */