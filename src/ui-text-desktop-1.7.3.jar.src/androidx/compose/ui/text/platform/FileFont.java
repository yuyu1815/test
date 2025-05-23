/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.ExperimentalTextApi;
/*     */ import androidx.compose.ui.text.font.FontLoadingStrategy;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import java.io.File;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B#\b\000\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034H\002J\b\020\035\032\0020\036H\026J\b\020\037\032\0020\fH\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\024\020\013\032\0020\f8VX\004¢\006\006\032\004\b\r\020\016R$\020\017\032\0020\0208\026X\004ø\001\000ø\001\001¢\006\020\n\002\020\025\022\004\b\021\020\022\032\004\b\023\020\024R\034\020\006\032\0020\007X\004ø\001\000ø\001\001¢\006\n\n\002\020\025\032\004\b\026\020\024R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\027\020\030\002\013\n\005\b¡\0360\001\n\002\b!¨\006 "}, d2 = {"Landroidx/compose/ui/text/platform/FileFont;", "Landroidx/compose/ui/text/platform/PlatformFont;", "file", "Ljava/io/File;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFile", "()Ljava/io/File;", "identity", "", "getIdentity", "()Ljava/lang/String;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "getLoadingStrategy-PKNRLFQ", "()I", "I", "getStyle-_-LCdwA", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "equals", "", "other", "", "hashCode", "", "toString", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class FileFont
/*     */   extends PlatformFont
/*     */ {
/*     */   @NotNull
/*     */   private final File file;
/*     */   @NotNull
/*     */   private final FontWeight weight;
/*     */   private final int style;
/*     */   private final int loadingStrategy;
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public final File getFile() {
/* 112 */     return this.file; } @NotNull
/* 113 */   public FontWeight getWeight() { return this.weight; }
/* 114 */   public int getStyle-_-LCdwA() { return this.style; }
/* 115 */   private FileFont(File file, FontWeight weight, int style) { super(null);
/*     */     
/*     */     this.file = file;
/*     */     this.weight = weight;
/*     */     this.style = style;
/* 120 */     this.loadingStrategy = FontLoadingStrategy.Companion.getBlocking-PKNRLFQ(); } public int getLoadingStrategy-PKNRLFQ() { return this.loadingStrategy; }
/*     */   @NotNull
/*     */   public String getIdentity() { Intrinsics.checkNotNullExpressionValue(this.file.toString(), "toString(...)");
/* 123 */     return this.file.toString(); } public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 124 */     if (!Intrinsics.areEqual(getClass(), (other != null) ? other.getClass() : null)) return false;
/*     */     
/* 126 */     Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.ui.text.platform.FileFont"); (FileFont)other;
/*     */     
/* 128 */     if (!Intrinsics.areEqual(this.file, ((FileFont)other).file)) return false; 
/* 129 */     if (!Intrinsics.areEqual(getWeight(), ((FileFont)other).getWeight())) return false; 
/* 130 */     return FontStyle.equals-impl0(getStyle-_-LCdwA(), ((FileFont)other).getStyle-_-LCdwA()); }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 134 */     int result = this.file.hashCode();
/* 135 */     result = 31 * result + getWeight().hashCode();
/* 136 */     result = 31 * result + FontStyle.hashCode-impl(getStyle-_-LCdwA());
/* 137 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 141 */     return "FileFont(file=" + this.file + ", weight=" + getWeight() + ", style=" + FontStyle.toString-impl(getStyle-_-LCdwA()) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\FileFont.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */