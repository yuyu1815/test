/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.saveable.Saver;
/*     */ import androidx.compose.runtime.saveable.SaverKt;
/*     */ import androidx.compose.runtime.saveable.SaverScope;
/*     */ import androidx.compose.ui.text.AnnotatedString;
/*     */ import androidx.compose.ui.text.SaversKt;
/*     */ import androidx.compose.ui.text.TextRange;
/*     */ import androidx.compose.ui.text.TextRangeKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\b\007\030\000 \0362\0020\001:\001\036B'\b\026\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\005¢\006\002\020\007B#\022\006\020\b\032\0020\t\022\b\b\002\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\005¢\006\002\020\nJ0\020\024\032\0020\0002\b\b\002\020\b\032\0020\t2\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\005ø\001\000¢\006\004\b\025\020\026J.\020\024\032\0020\0002\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\005ø\001\000¢\006\004\b\025\020\027J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001H\002J\b\020\033\032\0020\034H\026J\b\020\035\032\0020\003H\026R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\013\020\fR\031\020\006\032\004\030\0010\005ø\001\000ø\001\001¢\006\b\n\000\032\004\b\r\020\016R\031\020\004\032\0020\005ø\001\000ø\001\001¢\006\n\n\002\020\021\032\004\b\017\020\020R\021\020\002\032\0020\0038F¢\006\006\032\004\b\022\020\023\002\013\n\005\b¡\0360\001\n\002\b!¨\006\037"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "composition", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getSelection-d9O1mEE", "()J", "J", "getText", "()Ljava/lang/String;", "copy", "copy-3r_uNRQ", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "equals", "", "other", "hashCode", "", "toString", "Companion", "ui-text"})
/*     */ @Immutable
/*     */ public final class TextFieldValue
/*     */ {
/*     */   @NotNull
/*     */   public final AnnotatedString getAnnotatedString() {
/*     */     return this.annotatedString;
/*     */   }
/*     */   
/*     */   private TextFieldValue(String text, long selection, TextRange composition) {
/*     */     this(new AnnotatedString(text, null, null, 6, null), selection, composition, (DefaultConstructorMarker)null);
/*     */   }
/*     */   
/*     */   private TextFieldValue(AnnotatedString annotatedString, long selection, TextRange composition) {
/*  63 */     this.annotatedString = annotatedString;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     this.selection = TextRangeKt.coerceIn-8ffj60Q(selection, 0, getText().length());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     this.composition = (composition != null) ? TextRange.box-impl(TextRangeKt.coerceIn-8ffj60Q(composition.unbox-impl(), 0, getText().length())) : null; } @Nullable public final TextRange getComposition-MzsxiRA() { return this.composition; }
/*     */    @NotNull
/*     */   public final String getText() {
/*     */     return this.annotatedString.getText();
/*     */   }
/*     */   public final long getSelection-d9O1mEE() {
/*     */     return this.selection;
/*     */   }
/*     */   @NotNull
/*     */   public final TextFieldValue copy-3r_uNRQ(@NotNull AnnotatedString annotatedString, long selection, @Nullable TextRange composition) {
/* 112 */     Intrinsics.checkNotNullParameter(annotatedString, "annotatedString"); return new TextFieldValue(annotatedString, selection, composition, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TextFieldValue copy-3r_uNRQ(@NotNull String text, long selection, @Nullable TextRange composition) {
/* 123 */     Intrinsics.checkNotNullParameter(text, "text"); return new TextFieldValue(new AnnotatedString(text, null, null, 6, null), selection, composition, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 128 */     if (this == other) return true; 
/* 129 */     if (!(other instanceof TextFieldValue)) return false;
/*     */ 
/*     */ 
/*     */     
/* 133 */     return (TextRange.equals-impl0(this.selection, ((TextFieldValue)other).selection) && 
/* 134 */       Intrinsics.areEqual(this.composition, ((TextFieldValue)other).composition) && 
/* 135 */       Intrinsics.areEqual(this.annotatedString, ((TextFieldValue)other).annotatedString));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 140 */     int result = this.annotatedString.hashCode();
/* 141 */     result = 31 * result + TextRange.hashCode-impl(this.selection);
/* 142 */     result = 31 * result + ((this.composition != null) ? TextRange.hashCode-impl(this.composition.unbox-impl()) : 0);
/* 143 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 147 */     return "TextFieldValue(text='" + 
/* 148 */       this.annotatedString + "', selection=" + TextRange.toString-impl(
/* 149 */         this.selection) + ", composition=" + 
/* 150 */       this.composition + ')';
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\035\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0010\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text"})
/*     */   public static final class Companion { private Companion() {}
/*     */     
/*     */     @NotNull
/* 157 */     public final Saver<TextFieldValue, Object> getSaver() { return TextFieldValue.Saver; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final AnnotatedString annotatedString; private final long selection; @Nullable private final TextRange composition; public static final int $stable; @NotNull private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(TextFieldValue$Companion$Saver$1.INSTANCE, TextFieldValue$Companion$Saver$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/input/TextFieldValue;", "invoke"})
/*     */   static final class TextFieldValue$Companion$Saver$1 extends Lambda implements Function2<SaverScope, TextFieldValue, Object> {
/*     */     public static final TextFieldValue$Companion$Saver$1 INSTANCE = new TextFieldValue$Companion$Saver$1(); TextFieldValue$Companion$Saver$1() { super(2); } @Nullable
/* 160 */     public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull TextFieldValue it) { Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver"); Intrinsics.checkNotNullParameter(it, "it"); Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = SaversKt.save(it.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), $this$Saver); arrayOfObject[1] = 
/* 161 */         SaversKt.save(TextRange.box-impl(it.getSelection-d9O1mEE()), SaversKt.getSaver(TextRange.Companion), $this$Saver);
/*     */       return CollectionsKt.arrayListOf(arrayOfObject); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/TextFieldValue;", "it", "", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nTextFieldValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n62#2,2:203\n62#2,2:206\n1#3:205\n1#3:208\n*S KotlinDebug\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n*L\n168#1:203,2\n169#1:206,2\n168#1:205\n169#1:208\n*E\n"})
/*     */   static final class TextFieldValue$Companion$Saver$2 extends Lambda implements Function1<Object, TextFieldValue> { @Nullable
/*     */     public final TextFieldValue invoke(@NotNull Object it) {
/* 166 */       Intrinsics.checkNotNullParameter(it, "it"); List<Object> list = (List)it;
/*     */       
/* 168 */       Object object = list.get(0); Saver saver$iv = SaversKt.getAnnotatedStringSaver(); int $i$f$restore = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 204 */       Object it$iv = object;
/* 205 */       int $i$a$-let-SaversKt$restore$1$iv = 0; Saver $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv; int $i$a$-with-SaversKt$restore$1$1$iv = 0; Intrinsics.checkNotNull((Intrinsics.areEqual(object, Boolean.valueOf(false)) && !(saver$iv instanceof androidx.compose.ui.text.NonNullValueClassSaver)) ? null : ((object != null) ? (AnnotatedString)$this$restore_u24lambda_u243_u24lambda_u242$iv.restore(object) : null)); Object value$iv = list.get(1); saver$iv = SaversKt.getSaver(TextRange.Companion);
/*     */       $i$f$restore = 0;
/* 207 */       it$iv = value$iv;
/* 208 */       $i$a$-let-SaversKt$restore$1$iv = 0; $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv; $i$a$-with-SaversKt$restore$1$1$iv = 0;
/*     */       Intrinsics.checkNotNull((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver$iv instanceof androidx.compose.ui.text.NonNullValueClassSaver)) ? null : ((value$iv != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(value$iv) : null));
/*     */       return new TextFieldValue((Intrinsics.areEqual(object, Boolean.valueOf(false)) && !(saver$iv instanceof androidx.compose.ui.text.NonNullValueClassSaver)) ? null : ((object != null) ? (AnnotatedString)$this$restore_u24lambda_u243_u24lambda_u242$iv.restore(object) : null), ((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver$iv instanceof androidx.compose.ui.text.NonNullValueClassSaver)) ? null : ((value$iv != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(value$iv) : null)).unbox-impl(), null, 4, null);
/*     */     }
/*     */     
/*     */     public static final TextFieldValue$Companion$Saver$2 INSTANCE = new TextFieldValue$Companion$Saver$2();
/*     */     
/*     */     TextFieldValue$Companion$Saver$2() {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\TextFieldValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */