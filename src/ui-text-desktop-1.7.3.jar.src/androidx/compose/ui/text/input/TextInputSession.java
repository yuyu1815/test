/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.text.TextLayoutResult;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Deprecated(message = "Use PlatformTextInputModifierNode instead.")
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\006\020\n\032\0020\013J\027\020\f\032\0020\b2\f\020\r\032\b\022\004\022\0020\0130\016H\bJ\006\020\017\032\0020\bJ\016\020\020\032\0020\b2\006\020\021\032\0020\022J\006\020\023\032\0020\bJ\030\020\024\032\0020\b2\b\020\025\032\004\030\0010\0262\006\020\027\032\0020\026JB\020\030\032\0020\b2\006\020\031\032\0020\0262\006\020\032\032\0020\0332\006\020\034\032\0020\0352\022\020\036\032\016\022\004\022\0020 \022\004\022\0020\0130\0372\006\020!\032\0020\0222\006\020\"\032\0020\022R\021\020\007\032\0020\b8F¢\006\006\032\004\b\007\020\tR\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006#"}, d2 = {"Landroidx/compose/ui/text/input/TextInputSession;", "", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "platformTextInputService", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "isOpen", "", "()Z", "dispose", "", "ensureOpenSession", "block", "Lkotlin/Function0;", "hideSoftwareKeyboard", "notifyFocusedRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "showSoftwareKeyboard", "updateState", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "newValue", "updateTextLayoutResult", "textFieldValue", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "textFieldToRootTransform", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "innerTextFieldBounds", "decorationBoxBounds", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,373:1\n179#1,5:374\n179#1,5:379\n179#1,5:384\n179#1,5:389\n179#1,5:394\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n198#1:374,5\n222#1:379,5\n251#1:384,5\n271#1:389,5\n288#1:394,5\n*E\n"})
/*     */ public final class TextInputSession
/*     */ {
/*     */   @NotNull
/*     */   private final TextInputService textInputService;
/*     */   @NotNull
/*     */   private final PlatformTextInputService platformTextInputService;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public TextInputSession(@NotNull TextInputService textInputService, @NotNull PlatformTextInputService platformTextInputService) {
/* 146 */     this.textInputService = textInputService;
/* 147 */     this.platformTextInputService = platformTextInputService;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean isOpen() {
/* 155 */     return Intrinsics.areEqual(this.textInputService.getCurrentInputSession$ui_text(), this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void dispose() {
/* 166 */     this.textInputService.stopInput(this);
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
/*     */   private final boolean ensureOpenSession(Function0 block) {
/* 179 */     int $i$f$ensureOpenSession = 0; boolean bool1 = isOpen(), applying = bool1; int $i$a$-also-TextInputSession$ensureOpenSession$1 = 0;
/* 180 */     if (applying)
/* 181 */       block.invoke(); 
/*     */     return bool1;
/*     */   }
/*     */   
/*     */   public final boolean notifyFocusedRect(@NotNull Rect rect) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'rect'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: astore_2
/*     */     //   8: iconst_0
/*     */     //   9: istore_3
/*     */     //   10: aload_2
/*     */     //   11: invokevirtual isOpen : ()Z
/*     */     //   14: istore #4
/*     */     //   16: iload #4
/*     */     //   18: istore #5
/*     */     //   20: iconst_0
/*     */     //   21: istore #6
/*     */     //   23: iload #5
/*     */     //   25: ifeq -> 43
/*     */     //   28: iconst_0
/*     */     //   29: istore #7
/*     */     //   31: aload_0
/*     */     //   32: getfield platformTextInputService : Landroidx/compose/ui/text/input/PlatformTextInputService;
/*     */     //   35: aload_1
/*     */     //   36: invokeinterface notifyFocusedRect : (Landroidx/compose/ui/geometry/Rect;)V
/*     */     //   41: nop
/*     */     //   42: nop
/*     */     //   43: nop
/*     */     //   44: iload #4
/*     */     //   46: nop
/*     */     //   47: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #198	-> 6
/*     */     //   #374	-> 10
/*     */     //   #375	-> 23
/*     */     //   #376	-> 28
/*     */     //   #199	-> 31
/*     */     //   #200	-> 41
/*     */     //   #376	-> 42
/*     */     //   #378	-> 43
/*     */     //   #374	-> 44
/*     */     //   #374	-> 46
/*     */     //   #200	-> 47
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   31	11	7	$i$a$-ensureOpenSession-TextInputSession$notifyFocusedRect$1	I
/*     */     //   23	21	6	$i$a$-also-TextInputSession$ensureOpenSession$1$iv	I
/*     */     //   20	24	5	applying$iv	Z
/*     */     //   10	37	3	$i$f$ensureOpenSession	I
/*     */     //   8	39	2	this_$iv	Landroidx/compose/ui/text/input/TextInputSession;
/*     */     //   0	48	0	this	Landroidx/compose/ui/text/input/TextInputSession;
/*     */     //   0	48	1	rect	Landroidx/compose/ui/geometry/Rect;
/*     */   }
/*     */   
/*     */   public final boolean updateTextLayoutResult(@NotNull TextFieldValue textFieldValue, @NotNull OffsetMapping offsetMapping, @NotNull TextLayoutResult textLayoutResult, @NotNull Function1 textFieldToRootTransform, @NotNull Rect innerTextFieldBounds, @NotNull Rect decorationBoxBounds) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'textFieldValue'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'offsetMapping'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'textLayoutResult'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc 'textFieldToRootTransform'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: aload #5
/*     */     //   27: ldc 'innerTextFieldBounds'
/*     */     //   29: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   32: aload #6
/*     */     //   34: ldc 'decorationBoxBounds'
/*     */     //   36: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   39: aload_0
/*     */     //   40: astore #7
/*     */     //   42: iconst_0
/*     */     //   43: istore #8
/*     */     //   45: aload #7
/*     */     //   47: invokevirtual isOpen : ()Z
/*     */     //   50: istore #9
/*     */     //   52: iload #9
/*     */     //   54: istore #10
/*     */     //   56: iconst_0
/*     */     //   57: istore #11
/*     */     //   59: iload #10
/*     */     //   61: ifeq -> 87
/*     */     //   64: iconst_0
/*     */     //   65: istore #12
/*     */     //   67: aload_0
/*     */     //   68: getfield platformTextInputService : Landroidx/compose/ui/text/input/PlatformTextInputService;
/*     */     //   71: aload_1
/*     */     //   72: aload_2
/*     */     //   73: aload_3
/*     */     //   74: aload #4
/*     */     //   76: aload #5
/*     */     //   78: aload #6
/*     */     //   80: invokeinterface updateTextLayoutResult : (Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V
/*     */     //   85: nop
/*     */     //   86: nop
/*     */     //   87: nop
/*     */     //   88: iload #9
/*     */     //   90: nop
/*     */     //   91: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #222	-> 39
/*     */     //   #379	-> 45
/*     */     //   #380	-> 59
/*     */     //   #381	-> 64
/*     */     //   #223	-> 67
/*     */     //   #224	-> 71
/*     */     //   #225	-> 72
/*     */     //   #226	-> 73
/*     */     //   #227	-> 74
/*     */     //   #228	-> 76
/*     */     //   #229	-> 78
/*     */     //   #223	-> 80
/*     */     //   #231	-> 85
/*     */     //   #381	-> 86
/*     */     //   #383	-> 87
/*     */     //   #379	-> 88
/*     */     //   #379	-> 90
/*     */     //   #231	-> 91
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   67	19	12	$i$a$-ensureOpenSession-TextInputSession$updateTextLayoutResult$1	I
/*     */     //   59	29	11	$i$a$-also-TextInputSession$ensureOpenSession$1$iv	I
/*     */     //   56	32	10	applying$iv	Z
/*     */     //   45	46	8	$i$f$ensureOpenSession	I
/*     */     //   42	49	7	this_$iv	Landroidx/compose/ui/text/input/TextInputSession;
/*     */     //   0	92	0	this	Landroidx/compose/ui/text/input/TextInputSession;
/*     */     //   0	92	1	textFieldValue	Landroidx/compose/ui/text/input/TextFieldValue;
/*     */     //   0	92	2	offsetMapping	Landroidx/compose/ui/text/input/OffsetMapping;
/*     */     //   0	92	3	textLayoutResult	Landroidx/compose/ui/text/TextLayoutResult;
/*     */     //   0	92	4	textFieldToRootTransform	Lkotlin/jvm/functions/Function1;
/*     */     //   0	92	5	innerTextFieldBounds	Landroidx/compose/ui/geometry/Rect;
/*     */     //   0	92	6	decorationBoxBounds	Landroidx/compose/ui/geometry/Rect;
/*     */   }
/*     */   
/*     */   public final boolean updateState(@Nullable TextFieldValue oldValue, @NotNull TextFieldValue newValue) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 'newValue'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: astore_3
/*     */     //   8: iconst_0
/*     */     //   9: istore #4
/*     */     //   11: aload_3
/*     */     //   12: invokevirtual isOpen : ()Z
/*     */     //   15: istore #5
/*     */     //   17: iload #5
/*     */     //   19: istore #6
/*     */     //   21: iconst_0
/*     */     //   22: istore #7
/*     */     //   24: iload #6
/*     */     //   26: ifeq -> 45
/*     */     //   29: iconst_0
/*     */     //   30: istore #8
/*     */     //   32: aload_0
/*     */     //   33: getfield platformTextInputService : Landroidx/compose/ui/text/input/PlatformTextInputService;
/*     */     //   36: aload_1
/*     */     //   37: aload_2
/*     */     //   38: invokeinterface updateState : (Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)V
/*     */     //   43: nop
/*     */     //   44: nop
/*     */     //   45: nop
/*     */     //   46: iload #5
/*     */     //   48: nop
/*     */     //   49: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #251	-> 6
/*     */     //   #384	-> 11
/*     */     //   #385	-> 24
/*     */     //   #386	-> 29
/*     */     //   #252	-> 32
/*     */     //   #253	-> 43
/*     */     //   #386	-> 44
/*     */     //   #388	-> 45
/*     */     //   #384	-> 46
/*     */     //   #384	-> 48
/*     */     //   #253	-> 49
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   32	12	8	$i$a$-ensureOpenSession-TextInputSession$updateState$1	I
/*     */     //   24	22	7	$i$a$-also-TextInputSession$ensureOpenSession$1$iv	I
/*     */     //   21	25	6	applying$iv	Z
/*     */     //   11	38	4	$i$f$ensureOpenSession	I
/*     */     //   8	41	3	this_$iv	Landroidx/compose/ui/text/input/TextInputSession;
/*     */     //   0	50	0	this	Landroidx/compose/ui/text/input/TextInputSession;
/*     */     //   0	50	1	oldValue	Landroidx/compose/ui/text/input/TextFieldValue;
/*     */     //   0	50	2	newValue	Landroidx/compose/ui/text/input/TextFieldValue;
/*     */   }
/*     */   
/*     */   public final boolean showSoftwareKeyboard() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore_1
/*     */     //   2: iconst_0
/*     */     //   3: istore_2
/*     */     //   4: aload_1
/*     */     //   5: invokevirtual isOpen : ()Z
/*     */     //   8: istore_3
/*     */     //   9: iload_3
/*     */     //   10: istore #4
/*     */     //   12: iconst_0
/*     */     //   13: istore #5
/*     */     //   15: iload #4
/*     */     //   17: ifeq -> 34
/*     */     //   20: iconst_0
/*     */     //   21: istore #6
/*     */     //   23: aload_0
/*     */     //   24: getfield platformTextInputService : Landroidx/compose/ui/text/input/PlatformTextInputService;
/*     */     //   27: invokeinterface showSoftwareKeyboard : ()V
/*     */     //   32: nop
/*     */     //   33: nop
/*     */     //   34: nop
/*     */     //   35: iload_3
/*     */     //   36: nop
/*     */     //   37: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #271	-> 0
/*     */     //   #389	-> 4
/*     */     //   #390	-> 15
/*     */     //   #391	-> 20
/*     */     //   #272	-> 23
/*     */     //   #273	-> 32
/*     */     //   #391	-> 33
/*     */     //   #393	-> 34
/*     */     //   #389	-> 35
/*     */     //   #389	-> 36
/*     */     //   #273	-> 37
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   23	10	6	$i$a$-ensureOpenSession-TextInputSession$showSoftwareKeyboard$1	I
/*     */     //   15	20	5	$i$a$-also-TextInputSession$ensureOpenSession$1$iv	I
/*     */     //   12	23	4	applying$iv	Z
/*     */     //   4	33	2	$i$f$ensureOpenSession	I
/*     */     //   2	35	1	this_$iv	Landroidx/compose/ui/text/input/TextInputSession;
/*     */     //   0	38	0	this	Landroidx/compose/ui/text/input/TextInputSession;
/*     */   }
/*     */   
/*     */   public final boolean hideSoftwareKeyboard() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore_1
/*     */     //   2: iconst_0
/*     */     //   3: istore_2
/*     */     //   4: aload_1
/*     */     //   5: invokevirtual isOpen : ()Z
/*     */     //   8: istore_3
/*     */     //   9: iload_3
/*     */     //   10: istore #4
/*     */     //   12: iconst_0
/*     */     //   13: istore #5
/*     */     //   15: iload #4
/*     */     //   17: ifeq -> 34
/*     */     //   20: iconst_0
/*     */     //   21: istore #6
/*     */     //   23: aload_0
/*     */     //   24: getfield platformTextInputService : Landroidx/compose/ui/text/input/PlatformTextInputService;
/*     */     //   27: invokeinterface hideSoftwareKeyboard : ()V
/*     */     //   32: nop
/*     */     //   33: nop
/*     */     //   34: nop
/*     */     //   35: iload_3
/*     */     //   36: nop
/*     */     //   37: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #288	-> 0
/*     */     //   #394	-> 4
/*     */     //   #395	-> 15
/*     */     //   #396	-> 20
/*     */     //   #289	-> 23
/*     */     //   #290	-> 32
/*     */     //   #396	-> 33
/*     */     //   #398	-> 34
/*     */     //   #394	-> 35
/*     */     //   #394	-> 36
/*     */     //   #290	-> 37
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   23	10	6	$i$a$-ensureOpenSession-TextInputSession$hideSoftwareKeyboard$1	I
/*     */     //   15	20	5	$i$a$-also-TextInputSession$ensureOpenSession$1$iv	I
/*     */     //   12	23	4	applying$iv	Z
/*     */     //   4	33	2	$i$f$ensureOpenSession	I
/*     */     //   2	35	1	this_$iv	Landroidx/compose/ui/text/input/TextInputSession;
/*     */     //   0	38	0	this	Landroidx/compose/ui/text/input/TextInputSession;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\TextInputSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */