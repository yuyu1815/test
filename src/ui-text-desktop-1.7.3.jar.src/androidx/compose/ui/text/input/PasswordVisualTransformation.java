/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.AnnotatedString;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\020\f\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\b\007\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\nH\002J\020\020\013\032\0020\f2\006\020\r\032\0020\016H\026J\b\020\017\032\0020\020H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Landroidx/compose/ui/text/input/PasswordVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "mask", "", "(C)V", "getMask", "()C", "equals", "", "other", "", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "hashCode", "", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class PasswordVisualTransformation
/*     */   implements VisualTransformation
/*     */ {
/*     */   private final char mask;
/*     */   public static final int $stable;
/*     */   
/*     */   public PasswordVisualTransformation(char mask) {
/* 107 */     this.mask = mask; } public final char getMask() { return this.mask; } @NotNull
/*     */   public TransformedText filter(@NotNull AnnotatedString text) {
/* 109 */     Intrinsics.checkNotNullParameter(text, "text"); return new TransformedText(
/* 110 */         new AnnotatedString(StringsKt.repeat(String.valueOf(this.mask), text.getText().length()), null, null, 6, null), 
/* 111 */         OffsetMapping.Companion.getIdentity());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 116 */     if (this == other) return true; 
/* 117 */     if (!(other instanceof PasswordVisualTransformation)) return false; 
/* 118 */     if (this.mask != ((PasswordVisualTransformation)other).mask) return false; 
/* 119 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 123 */     return Character.hashCode(this.mask);
/*     */   }
/*     */   
/*     */   public PasswordVisualTransformation() {
/*     */     this(false, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\PasswordVisualTransformation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */