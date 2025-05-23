/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.AnnotatedString;
/*     */ import androidx.compose.ui.text.AnnotatedStringKt;
/*     */ import androidx.compose.ui.text.TextRange;
/*     */ import androidx.compose.ui.text.TextRangeKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Reflection;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001B\005¢\006\002\020\002J\024\020\f\032\0020\b2\f\020\r\032\b\022\004\022\0020\0170\016J \020\020\032\0020\0212\f\020\r\032\b\022\004\022\0020\0170\0162\b\020\022\032\004\030\0010\017H\002J\030\020\023\032\0020\0242\006\020\025\032\0020\b2\b\020\026\032\004\030\0010\027J\006\020\030\032\0020\bJ\f\020\031\032\0020\021*\0020\017H\002R\036\020\005\032\0020\0042\006\020\003\032\0020\004@BX\016¢\006\b\n\000\032\004\b\006\020\007R\036\020\t\032\0020\b2\006\020\003\032\0020\b@BX\016¢\006\b\n\000\032\004\b\n\020\013¨\006\032"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "()V", "<set-?>", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "getMBuffer$ui_text", "()Landroidx/compose/ui/text/input/EditingBuffer;", "Landroidx/compose/ui/text/input/TextFieldValue;", "mBufferState", "getMBufferState$ui_text", "()Landroidx/compose/ui/text/input/TextFieldValue;", "apply", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "generateBatchErrorMessage", "", "failedCommand", "reset", "", "value", "textInputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "toTextFieldValue", "toStringForLog", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n33#2,6:183\n1#3:189\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n115#1:183,6\n*E\n"})
/*     */ public final class EditProcessor
/*     */ {
/*     */   @NotNull
/*  39 */   private TextFieldValue mBufferState = new TextFieldValue(
/*  40 */       AnnotatedStringKt.emptyAnnotatedString(), 
/*  41 */       TextRange.Companion.getZero-d9O1mEE(), 
/*  42 */       null, null);
/*     */   @NotNull
/*     */   public final TextFieldValue getMBufferState$ui_text() {
/*     */     return this.mBufferState;
/*     */   }
/*     */   @NotNull
/*  48 */   private EditingBuffer mBuffer = new EditingBuffer(
/*  49 */       this.mBufferState.getAnnotatedString(), 
/*  50 */       this.mBufferState.getSelection-d9O1mEE(), null);
/*     */ 
/*     */   
/*     */   public static final int $stable = 8;
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final EditingBuffer getMBuffer$ui_text() {
/*     */     return this.mBuffer;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void reset(@NotNull TextFieldValue value, @Nullable TextInputSession textInputSession) {
/*  65 */     Intrinsics.checkNotNullParameter(value, "value"); boolean textChanged = false;
/*  66 */     boolean selectionChanged = false;
/*  67 */     boolean compositionChanged = !Intrinsics.areEqual(value.getComposition-MzsxiRA(), this.mBuffer.getComposition-MzsxiRA$ui_text());
/*     */     
/*  69 */     if (!Intrinsics.areEqual(this.mBufferState.getAnnotatedString(), value.getAnnotatedString())) {
/*  70 */       this.mBuffer = new EditingBuffer(
/*  71 */           value.getAnnotatedString(), 
/*  72 */           value.getSelection-d9O1mEE(), null);
/*     */       
/*  74 */       textChanged = true;
/*  75 */     } else if (!TextRange.equals-impl0(this.mBufferState.getSelection-d9O1mEE(), value.getSelection-d9O1mEE())) {
/*  76 */       this.mBuffer.setSelection$ui_text(TextRange.getMin-impl(value.getSelection-d9O1mEE()), TextRange.getMax-impl(value.getSelection-d9O1mEE()));
/*  77 */       selectionChanged = true;
/*     */     } 
/*     */     
/*  80 */     if (value.getComposition-MzsxiRA() == null) {
/*  81 */       this.mBuffer.commitComposition$ui_text();
/*  82 */     } else if (!TextRange.getCollapsed-impl(value.getComposition-MzsxiRA().unbox-impl())) {
/*  83 */       this.mBuffer.setComposition$ui_text(TextRange.getMin-impl(value.getComposition-MzsxiRA().unbox-impl()), TextRange.getMax-impl(value.getComposition-MzsxiRA().unbox-impl()));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     this.mBuffer.commitComposition$ui_text();
/*  91 */     TextFieldValue newValue = (textChanged || (!selectionChanged && compositionChanged)) ? TextFieldValue.copy-3r_uNRQ$default(value, (AnnotatedString)null, 0L, (TextRange)null, 3, (Object)null) : 
/*     */       
/*  93 */       value;
/*     */ 
/*     */     
/*  96 */     TextFieldValue oldValue = this.mBufferState;
/*  97 */     this.mBufferState = newValue;
/*     */     
/*  99 */     if (textInputSession != null) { textInputSession.updateState(oldValue, newValue); }
/*     */     else
/*     */     {  }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TextFieldValue apply(@NotNull List editCommands) {
/* 113 */     Intrinsics.checkNotNullParameter(editCommands, "editCommands"); Object lastCommand = null;
/*     */     
/* 115 */     try { List $this$fastForEach$iv = editCommands; int $i$f$fastForEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 184 */       int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 185 */         Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 186 */         EditCommand editCommand = (EditCommand)item$iv; int $i$a$-fastForEach-EditProcessor$apply$1 = 0; lastCommand = editCommand; editCommand.applyTo(this.mBuffer);
/*     */       }  }
/*     */     catch (Exception e) { throw new RuntimeException(generateBatchErrorMessage(editCommands, (EditCommand)lastCommand), (Throwable)e); }
/* 189 */      long l1 = this.mBuffer.getSelection-d9O1mEE$ui_text(); AnnotatedString annotatedString1 = this.mBuffer.toAnnotatedString$ui_text(); int $i$a$-run-EditProcessor$apply$newState$1 = 0; TextRange textRange1 = TextRange.box-impl(l1); long it = textRange1.unbox-impl(); int $i$a$-takeUnless-EditProcessor$apply$newState$1$1 = 0;
/*     */     !TextRange.getReversed-impl(this.mBufferState.getSelection-d9O1mEE()) ? textRange1 : null;
/*     */     long l2 = ((!TextRange.getReversed-impl(this.mBufferState.getSelection-d9O1mEE()) ? textRange1 : null) != null) ? (!TextRange.getReversed-impl(this.mBufferState.getSelection-d9O1mEE()) ? textRange1 : null).unbox-impl() : TextRangeKt.TextRange(TextRange.getMax-impl(l1), TextRange.getMin-impl(l1));
/*     */     DefaultConstructorMarker defaultConstructorMarker = null;
/*     */     TextRange textRange2 = this.mBuffer.getComposition-MzsxiRA$ui_text();
/*     */     long l3 = l2;
/*     */     AnnotatedString annotatedString2 = annotatedString1;
/*     */     TextFieldValue newState = new TextFieldValue(annotatedString2, l3, textRange2, defaultConstructorMarker);
/*     */     this.mBufferState = newState;
/*     */     return newState;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TextFieldValue toTextFieldValue() {
/*     */     return this.mBufferState;
/*     */   }
/*     */   
/*     */   private final String generateBatchErrorMessage(List editCommands, EditCommand failedCommand) {
/*     */     StringBuilder stringBuilder1 = new StringBuilder(), $this$generateBatchErrorMessage_u24lambda_u243 = stringBuilder1;
/*     */     int $i$a$-buildString-EditProcessor$generateBatchErrorMessage$1 = 0;
/*     */     Intrinsics.checkNotNullExpressionValue($this$generateBatchErrorMessage_u24lambda_u243.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text() + ", composition=" + this.mBuffer.getComposition-MzsxiRA$ui_text() + ", selection=" + TextRange.toString-impl(this.mBuffer.getSelection-d9O1mEE$ui_text()) + "):"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$generateBatchErrorMessage_u24lambda_u243.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text() + ", composition=" + this.mBuffer.getComposition-MzsxiRA$ui_text() + ", selection=" + TextRange.toString-impl(this.mBuffer.getSelection-d9O1mEE$ui_text()) + "):").append('\n'), "append(...)");
/*     */     $this$generateBatchErrorMessage_u24lambda_u243.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text() + ", composition=" + this.mBuffer.getComposition-MzsxiRA$ui_text() + ", selection=" + TextRange.toString-impl(this.mBuffer.getSelection-d9O1mEE$ui_text()) + "):").append('\n');
/*     */     CollectionsKt.joinTo$default(editCommands, $this$generateBatchErrorMessage_u24lambda_u243, "\n", null, null, 0, null, new EditProcessor$generateBatchErrorMessage$1$1(this), 60, null);
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/input/EditCommand;", "invoke"})
/*     */   static final class EditProcessor$generateBatchErrorMessage$1$1 extends Lambda implements Function1<EditCommand, CharSequence> {
/*     */     @NotNull
/*     */     public final CharSequence invoke(@NotNull EditCommand it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       String prefix = (this.$failedCommand == it) ? " > " : "   ";
/*     */       return prefix + EditProcessor.this.toStringForLog(it);
/*     */     }
/*     */     
/*     */     EditProcessor$generateBatchErrorMessage$1$1(EditProcessor $receiver) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   private final String toStringForLog(EditCommand $this$toStringForLog) {
/*     */     EditCommand editCommand = $this$toStringForLog;
/*     */     if (Reflection.getOrCreateKotlinClass($this$toStringForLog.getClass()).getSimpleName() == null)
/*     */       Reflection.getOrCreateKotlinClass($this$toStringForLog.getClass()).getSimpleName(); 
/*     */     return (editCommand instanceof CommitTextCommand) ? ("CommitTextCommand(text.length=" + ((CommitTextCommand)$this$toStringForLog).getText().length() + ", newCursorPosition=" + ((CommitTextCommand)$this$toStringForLog).getNewCursorPosition() + ')') : ((editCommand instanceof SetComposingTextCommand) ? ("SetComposingTextCommand(text.length=" + ((SetComposingTextCommand)$this$toStringForLog).getText().length() + ", newCursorPosition=" + ((SetComposingTextCommand)$this$toStringForLog).getNewCursorPosition() + ')') : ((editCommand instanceof SetComposingRegionCommand) ? $this$toStringForLog.toString() : ((editCommand instanceof DeleteSurroundingTextCommand) ? $this$toStringForLog.toString() : ((editCommand instanceof DeleteSurroundingTextInCodePointsCommand) ? $this$toStringForLog.toString() : ((editCommand instanceof SetSelectionCommand) ? $this$toStringForLog.toString() : ((editCommand instanceof FinishComposingTextCommand) ? $this$toStringForLog.toString() : ((editCommand instanceof BackspaceCommand) ? $this$toStringForLog.toString() : ((editCommand instanceof MoveCursorCommand) ? $this$toStringForLog.toString() : ((editCommand instanceof DeleteAllCommand) ? $this$toStringForLog.toString() : Reflection.getOrCreateKotlinClass($this$toStringForLog.getClass()).getSimpleName().append("{anonymous EditCommand}").toString())))))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\EditProcessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */