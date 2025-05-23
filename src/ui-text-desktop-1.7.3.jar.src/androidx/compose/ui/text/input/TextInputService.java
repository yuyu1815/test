/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.annotation.RestrictTo;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.AtomicReference;
/*     */ import androidx.compose.ui.text.InternalTextApi;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\027\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\013\032\0020\fH\007J\b\020\r\032\0020\fH\007J\b\020\016\032\0020\fH\007JF\020\016\032\0020\0072\006\020\017\032\0020\0202\006\020\021\032\0020\0222\030\020\023\032\024\022\n\022\b\022\004\022\0020\0260\025\022\004\022\0020\f0\0242\022\020\027\032\016\022\004\022\0020\030\022\004\022\0020\f0\024H\026J\b\020\031\032\0020\fH\007J\020\020\031\032\0020\f2\006\020\032\032\0020\007H\026R\026\020\005\032\n\022\006\022\004\030\0010\0070\006X\004¢\006\002\n\000R\026\020\b\032\004\030\0010\0078@X\004¢\006\006\032\004\b\t\020\nR\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\033"}, d2 = {"Landroidx/compose/ui/text/input/TextInputService;", "", "platformTextInputService", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "(Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "_currentInputSession", "Landroidx/compose/ui/text/AtomicReference;", "Landroidx/compose/ui/text/input/TextInputSession;", "currentInputSession", "getCurrentInputSession$ui_text", "()Landroidx/compose/ui/text/input/TextInputSession;", "hideSoftwareKeyboard", "", "showSoftwareKeyboard", "startInput", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onEditCommand", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "stopInput", "session", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public class TextInputService
/*     */ {
/*     */   @NotNull
/*     */   private final PlatformTextInputService platformTextInputService;
/*     */   @NotNull
/*     */   private final AtomicReference<TextInputSession> _currentInputSession;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public TextInputService(@NotNull PlatformTextInputService platformTextInputService) {
/*  37 */     this.platformTextInputService = platformTextInputService;
/*     */     
/*  39 */     this._currentInputSession = new AtomicReference(null);
/*     */   } @Nullable
/*     */   public final TextInputSession getCurrentInputSession$ui_text() {
/*  42 */     return (TextInputSession)this._currentInputSession.get();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public TextInputSession startInput(@NotNull TextFieldValue value, @NotNull ImeOptions imeOptions, @NotNull Function1<? super List<? extends EditCommand>, Unit> onEditCommand, @NotNull Function1<? super ImeAction, Unit> onImeActionPerformed) {
/*  62 */     Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullParameter(imeOptions, "imeOptions"); Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand"); Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed"); this.platformTextInputService.startInput(
/*  63 */         value, 
/*  64 */         imeOptions, 
/*  65 */         onEditCommand, 
/*  66 */         onImeActionPerformed);
/*     */     
/*  68 */     TextInputSession nextSession = new TextInputSession(this, this.platformTextInputService);
/*  69 */     this._currentInputSession.set(nextSession);
/*  70 */     return nextSession;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @InternalTextApi
/*     */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/*     */   public final void startInput() {
/*  80 */     this.platformTextInputService.startInput();
/*  81 */     TextInputSession nextSession = new TextInputSession(this, this.platformTextInputService);
/*  82 */     this._currentInputSession.set(nextSession);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void stopInput(@NotNull TextInputSession session) {
/*  93 */     Intrinsics.checkNotNullParameter(session, "session"); if (this._currentInputSession.compareAndSet(session, null)) {
/*  94 */       this.platformTextInputService.stopInput();
/*     */     }
/*     */   }
/*     */   
/*     */   @InternalTextApi
/*     */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/*     */   public final void stopInput() {
/* 101 */     this.platformTextInputService.stopInput();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @ReplaceWith(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
/*     */   public final void showSoftwareKeyboard() {
/* 121 */     if (getCurrentInputSession$ui_text() != null) {
/* 122 */       this.platformTextInputService.showSoftwareKeyboard();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @ReplaceWith(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
/*     */   public final void hideSoftwareKeyboard() {
/* 135 */     this.platformTextInputService.hideSoftwareKeyboard();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\TextInputService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */