/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.ui.unit.TextUnit;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\007\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\007J.\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006ø\001\000¢\006\004\b\020\020\021J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001H\002J\b\020\025\032\0020\026H\026J\b\020\027\032\0020\030H\026R\031\020\004\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\n\032\004\b\b\020\tR\031\020\005\032\0020\006ø\001\000ø\001\001¢\006\n\n\002\020\r\032\004\b\013\020\fR\031\020\002\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\n\032\004\b\016\020\t\002\013\n\005\b¡\0360\001\n\002\b!¨\006\031"}, d2 = {"Landroidx/compose/ui/text/Placeholder;", "", "width", "Landroidx/compose/ui/unit/TextUnit;", "height", "placeholderVerticalAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHeight-XSAIIZE", "()J", "J", "getPlaceholderVerticalAlign-J6kI3mc", "()I", "I", "getWidth-XSAIIZE", "copy", "copy-K8Q-__8", "(JJI)Landroidx/compose/ui/text/Placeholder;", "equals", "", "other", "hashCode", "", "toString", "", "ui-text"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
/*     */ public final class Placeholder
/*     */ {
/*     */   private final long width;
/*     */   private final long height;
/*     */   private final int placeholderVerticalAlign;
/*     */   public static final int $stable;
/*     */   
/*     */   private Placeholder(long width, long height, int placeholderVerticalAlign) {
/*  38 */     this.width = width;
/*  39 */     this.height = height;
/*  40 */     this.placeholderVerticalAlign = placeholderVerticalAlign;
/*     */ 
/*     */     
/*  43 */     if (!(!TextUnitKt.isUnspecified--R2X_6o(this.width) ? 1 : 0))
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 138 */       int $i$a$-require-Placeholder$1 = 0; String str = "width cannot be TextUnit.Unspecified"; throw new IllegalArgumentException(str.toString()); }  if (!(!TextUnitKt.isUnspecified--R2X_6o(this.height) ? 1 : 0)) { int $i$a$-require-Placeholder$2 = 0;
/*     */       String str = "height cannot be TextUnit.Unspecified";
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */   
/*     */   }
/*     */   
/*     */   public final long getWidth-XSAIIZE() {
/*     */     return this.width;
/*     */   }
/*     */   
/*     */   public final long getHeight-XSAIIZE() {
/*     */     return this.height;
/*     */   }
/*     */   
/*     */   public final int getPlaceholderVerticalAlign-J6kI3mc() {
/*     */     return this.placeholderVerticalAlign;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Placeholder copy-K8Q-__8(long width, long height, int placeholderVerticalAlign) {
/*     */     return new Placeholder(width, height, placeholderVerticalAlign, null);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Placeholder))
/*     */       return false; 
/*     */     if (!TextUnit.equals-impl0(this.width, ((Placeholder)other).width))
/*     */       return false; 
/*     */     if (!TextUnit.equals-impl0(this.height, ((Placeholder)other).height))
/*     */       return false; 
/*     */     if (!PlaceholderVerticalAlign.equals-impl0(this.placeholderVerticalAlign, ((Placeholder)other).placeholderVerticalAlign))
/*     */       return false; 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     int result = TextUnit.hashCode-impl(this.width);
/*     */     result = 31 * result + TextUnit.hashCode-impl(this.height);
/*     */     result = 31 * result + PlaceholderVerticalAlign.hashCode-impl(this.placeholderVerticalAlign);
/*     */     return result;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Placeholder(width=" + TextUnit.toString-impl(this.width) + ", height=" + TextUnit.toString-impl(this.height) + ", placeholderVerticalAlign=" + PlaceholderVerticalAlign.toString-impl(this.placeholderVerticalAlign) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\Placeholder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */