/*     */ package feedback;
/*     */ import com.intellij.ui.components.JBRadioButton;
/*     */ import com.intellij.ui.components.JBTextField;
/*     */ import com.intellij.ui.dsl.builder.Row;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.json.JsonObjectBuilder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\007\030\0002\0020\0012\0020\0022\0020\003B%\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\006\020\t\032\0020\005¢\006\004\b\n\020\013J\020\020\025\032\0020\0262\006\020\027\032\0020\030H\026J\024\020\031\032\0020\0262\n\020\032\032\0060\033j\002`\034H\026J\020\020\035\032\0020\0262\006\020\036\032\0020\037H\026J\020\020 \032\0020\0002\b\b\002\020!\032\0020\005J\006\020\020\032\0020\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\b0\007X\004¢\006\002\n\000R\016\020\t\032\0020\005X\004¢\006\002\n\000R\016\020\f\032\0020\rX\016¢\006\002\n\000R\016\020\016\032\0020\005X\016¢\006\002\n\000R\016\020\017\032\0020\005X\016¢\006\002\n\000R\016\020\020\032\0020\rX\016¢\006\002\n\000R\020\020\021\032\004\030\0010\022X\016¢\006\002\n\000R\020\020\023\032\004\030\0010\024X\016¢\006\002\n\000¨\006\""}, d2 = {"Lfeedback/RadioButtonGroupBlock;", "Lfeedback/FeedbackBlock;", "Lfeedback/TextDescriptionProvider;", "Lfeedback/JsonDataProvider;", "myGroupLabel", "", "myItemsData", "", "Lfeedback/RadioButtonItemData;", "myJsonGroupName", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "myIncludeOtherTextField", "", "otherProperty", "otherTextfieldPlaceholderText", "requireAnswer", "otherRadioButton", "Lcom/intellij/ui/components/JBRadioButton;", "otherTextField", "Lcom/intellij/ui/components/JBTextField;", "addToPanel", "", "panel", "Lcom/intellij/ui/dsl/builder/Panel;", "collectBlockTextDescription", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "collectBlockDataToJson", "jsonObjectBuilder", "Lkotlinx/serialization/json/JsonObjectBuilder;", "addOtherTextField", "placeholderText", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nRadioButtonGroupBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButtonGroupBlock.kt\nfeedback/RadioButtonGroupBlock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,176:1\n1863#2,2:177\n1863#2,2:181\n1734#2,3:184\n1734#2,3:187\n1863#2,2:190\n1872#2,3:192\n29#3,2:179\n31#3:183\n*S KotlinDebug\n*F\n+ 1 RadioButtonGroupBlock.kt\nfeedback/RadioButtonGroupBlock\n*L\n133#1:177,2\n147#1:181,2\n51#1:184,3\n54#1:187,3\n57#1:190,2\n63#1:192,3\n146#1:179,2\n146#1:183\n*E\n"})
/*     */ public final class RadioButtonGroupBlock implements FeedbackBlock, TextDescriptionProvider, JsonDataProvider {
/*     */   @NotNull
/*     */   private final String myGroupLabel;
/*     */   @NotNull
/*     */   private final List<RadioButtonItemData> myItemsData;
/*     */   
/*     */   public RadioButtonGroupBlock(@NotNull String myGroupLabel, @NotNull List<RadioButtonItemData> myItemsData, @NotNull String myJsonGroupName) {
/*  22 */     this.myGroupLabel = myGroupLabel;
/*  23 */     this.myItemsData = myItemsData;
/*  24 */     this.myJsonGroupName = myJsonGroupName;
/*     */ 
/*     */ 
/*     */     
/*  28 */     this.otherProperty = "";
/*  29 */     this.otherTextfieldPlaceholderText = "";
/*     */   }
/*     */   @NotNull
/*     */   private final String myJsonGroupName; private boolean myIncludeOtherTextField; @NotNull
/*     */   private String otherProperty; @NotNull
/*     */   private String otherTextfieldPlaceholderText; private boolean requireAnswer; @Nullable
/*     */   private JBRadioButton otherRadioButton;
/*     */   @Nullable
/*     */   private JBTextField otherTextField;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public void addToPanel(@NotNull Panel panel) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'panel'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: new java/util/ArrayList
/*     */     //   9: dup
/*     */     //   10: invokespecial <init> : ()V
/*     */     //   13: astore_2
/*     */     //   14: aload_1
/*     */     //   15: astore_3
/*     */     //   16: aload_3
/*     */     //   17: astore #4
/*     */     //   19: iconst_0
/*     */     //   20: istore #5
/*     */     //   22: aload #4
/*     */     //   24: aconst_null
/*     */     //   25: iconst_0
/*     */     //   26: aload_0
/*     */     //   27: aload_2
/*     */     //   28: <illegal opcode> invoke : (Lfeedback/RadioButtonGroupBlock;Ljava/util/ArrayList;)Lkotlin/jvm/functions/Function1;
/*     */     //   33: iconst_1
/*     */     //   34: aconst_null
/*     */     //   35: invokestatic buttonsGroup$default : (Lcom/intellij/ui/dsl/builder/Panel;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/intellij/ui/dsl/builder/ButtonsGroup;
/*     */     //   38: pop
/*     */     //   39: nop
/*     */     //   40: nop
/*     */     //   41: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 6
/*     */     //   #36	-> 13
/*     */     //   #38	-> 14
/*     */     //   #39	-> 22
/*     */     //   #127	-> 39
/*     */     //   #38	-> 40
/*     */     //   #128	-> 41
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   22	18	5	$i$a$-apply-RadioButtonGroupBlock$addToPanel$1	I
/*     */     //   19	21	4	$this$addToPanel_u24lambda_u2418	Lcom/intellij/ui/dsl/builder/Panel;
/*     */     //   14	28	2	allButtons	Ljava/util/ArrayList;
/*     */     //   0	42	0	this	Lfeedback/RadioButtonGroupBlock;
/*     */     //   0	42	1	panel	Lcom/intellij/ui/dsl/builder/Panel;
/*     */   }
/*     */   
/*     */   private static final Unit addToPanel$lambda$18$lambda$17(RadioButtonGroupBlock this$0, ArrayList $allButtons, Panel $this$buttonsGroup) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w '$this$buttonsGroup'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: aconst_null
/*     */     //   9: aload_0
/*     */     //   10: aload_1
/*     */     //   11: <illegal opcode> invoke : (Lfeedback/RadioButtonGroupBlock;Ljava/util/ArrayList;)Lkotlin/jvm/functions/Function1;
/*     */     //   16: iconst_1
/*     */     //   17: aconst_null
/*     */     //   18: invokestatic row$default : (Lcom/intellij/ui/dsl/builder/Panel;Ljavax/swing/JLabel;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/intellij/ui/dsl/builder/Row;
/*     */     //   21: getstatic com/intellij/ui/dsl/builder/BottomGap.NONE : Lcom/intellij/ui/dsl/builder/BottomGap;
/*     */     //   24: invokeinterface bottomGap : (Lcom/intellij/ui/dsl/builder/BottomGap;)Lcom/intellij/ui/dsl/builder/Row;
/*     */     //   29: pop
/*     */     //   30: aload_0
/*     */     //   31: getfield myItemsData : Ljava/util/List;
/*     */     //   34: checkcast java/lang/Iterable
/*     */     //   37: astore_3
/*     */     //   38: iconst_0
/*     */     //   39: istore #4
/*     */     //   41: iconst_0
/*     */     //   42: istore #5
/*     */     //   44: aload_3
/*     */     //   45: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   50: astore #6
/*     */     //   52: aload #6
/*     */     //   54: invokeinterface hasNext : ()Z
/*     */     //   59: ifeq -> 168
/*     */     //   62: aload #6
/*     */     //   64: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   69: astore #7
/*     */     //   71: iload #5
/*     */     //   73: iinc #5, 1
/*     */     //   76: istore #8
/*     */     //   78: iload #8
/*     */     //   80: ifge -> 86
/*     */     //   83: invokestatic throwIndexOverflow : ()V
/*     */     //   86: iload #8
/*     */     //   88: aload #7
/*     */     //   90: checkcast feedback/RadioButtonItemData
/*     */     //   93: astore #9
/*     */     //   95: istore #10
/*     */     //   97: iconst_0
/*     */     //   98: istore #11
/*     */     //   100: aload_2
/*     */     //   101: aconst_null
/*     */     //   102: aload #9
/*     */     //   104: aload_0
/*     */     //   105: iload #10
/*     */     //   107: aload_1
/*     */     //   108: <illegal opcode> invoke : (Lfeedback/RadioButtonItemData;Lfeedback/RadioButtonGroupBlock;ILjava/util/ArrayList;)Lkotlin/jvm/functions/Function1;
/*     */     //   113: iconst_1
/*     */     //   114: aconst_null
/*     */     //   115: invokestatic row$default : (Lcom/intellij/ui/dsl/builder/Panel;Ljavax/swing/JLabel;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/intellij/ui/dsl/builder/Row;
/*     */     //   118: astore #12
/*     */     //   120: aload #12
/*     */     //   122: astore #13
/*     */     //   124: iconst_0
/*     */     //   125: istore #14
/*     */     //   127: iload #10
/*     */     //   129: aload_0
/*     */     //   130: getfield myItemsData : Ljava/util/List;
/*     */     //   133: invokeinterface size : ()I
/*     */     //   138: iconst_1
/*     */     //   139: isub
/*     */     //   140: if_icmpne -> 161
/*     */     //   143: aload_0
/*     */     //   144: getfield myIncludeOtherTextField : Z
/*     */     //   147: ifne -> 161
/*     */     //   150: aload #13
/*     */     //   152: getstatic com/intellij/ui/dsl/builder/BottomGap.MEDIUM : Lcom/intellij/ui/dsl/builder/BottomGap;
/*     */     //   155: invokeinterface bottomGap : (Lcom/intellij/ui/dsl/builder/BottomGap;)Lcom/intellij/ui/dsl/builder/Row;
/*     */     //   160: pop
/*     */     //   161: nop
/*     */     //   162: nop
/*     */     //   163: nop
/*     */     //   164: nop
/*     */     //   165: goto -> 52
/*     */     //   168: nop
/*     */     //   169: aload_0
/*     */     //   170: getfield myIncludeOtherTextField : Z
/*     */     //   173: ifeq -> 198
/*     */     //   176: aload_2
/*     */     //   177: aconst_null
/*     */     //   178: aload_0
/*     */     //   179: <illegal opcode> invoke : (Lfeedback/RadioButtonGroupBlock;)Lkotlin/jvm/functions/Function1;
/*     */     //   184: iconst_1
/*     */     //   185: aconst_null
/*     */     //   186: invokestatic row$default : (Lcom/intellij/ui/dsl/builder/Panel;Ljavax/swing/JLabel;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/intellij/ui/dsl/builder/Row;
/*     */     //   189: getstatic com/intellij/ui/dsl/builder/BottomGap.MEDIUM : Lcom/intellij/ui/dsl/builder/BottomGap;
/*     */     //   192: invokeinterface bottomGap : (Lcom/intellij/ui/dsl/builder/BottomGap;)Lcom/intellij/ui/dsl/builder/Row;
/*     */     //   197: pop
/*     */     //   198: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   201: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #40	-> 7
/*     */     //   #62	-> 21
/*     */     //   #63	-> 30
/*     */     //   #192	-> 41
/*     */     //   #193	-> 44
/*     */     //   #193	-> 88
/*     */     //   #64	-> 100
/*     */     //   #71	-> 120
/*     */     //   #72	-> 127
/*     */     //   #73	-> 150
/*     */     //   #75	-> 161
/*     */     //   #71	-> 162
/*     */     //   #76	-> 163
/*     */     //   #193	-> 164
/*     */     //   #194	-> 168
/*     */     //   #78	-> 169
/*     */     //   #79	-> 176
/*     */     //   #123	-> 189
/*     */     //   #126	-> 198
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   127	35	14	$i$a$-apply-RadioButtonGroupBlock$addToPanel$1$1$2$2	I
/*     */     //   124	38	13	$this$addToPanel_u24lambda_u2418_u24lambda_u2417_u24lambda_u2412_u24lambda_u2411	Lcom/intellij/ui/dsl/builder/Row;
/*     */     //   100	64	11	$i$a$-forEachIndexed-RadioButtonGroupBlock$addToPanel$1$1$2	I
/*     */     //   97	67	10	i	I
/*     */     //   97	67	9	itemData	Lfeedback/RadioButtonItemData;
/*     */     //   71	94	7	item$iv	Ljava/lang/Object;
/*     */     //   41	128	4	$i$f$forEachIndexed	I
/*     */     //   44	125	5	index$iv	I
/*     */     //   38	131	3	$this$forEachIndexed$iv	Ljava/lang/Iterable;
/*     */     //   0	202	0	this$0	Lfeedback/RadioButtonGroupBlock;
/*     */     //   0	202	1	$allButtons	Ljava/util/ArrayList;
/*     */     //   0	202	2	$this$buttonsGroup	Lcom/intellij/ui/dsl/builder/Panel;
/*     */   }
/*     */   
/*     */   private static final Unit addToPanel$lambda$18$lambda$17$lambda$6(RadioButtonGroupBlock this$0, ArrayList $allButtons, Row $this$row) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w '$this$row'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield myIncludeOtherTextField : Z
/*     */     //   11: ifeq -> 20
/*     */     //   14: ldc_w 'Choose options or write your own'
/*     */     //   17: goto -> 23
/*     */     //   20: ldc_w 'Choose options'
/*     */     //   23: astore_3
/*     */     //   24: aload_2
/*     */     //   25: aload_0
/*     */     //   26: getfield myGroupLabel : Ljava/lang/String;
/*     */     //   29: invokeinterface label : (Ljava/lang/String;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   34: invokeinterface bold : ()Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   39: aload_3
/*     */     //   40: aload_0
/*     */     //   41: aload_1
/*     */     //   42: <illegal opcode> invoke : (Lfeedback/RadioButtonGroupBlock;Ljava/util/ArrayList;)Lkotlin/jvm/functions/Function1;
/*     */     //   47: invokeinterface errorOnApply : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   52: astore #4
/*     */     //   54: aload #4
/*     */     //   56: astore #5
/*     */     //   58: iconst_0
/*     */     //   59: istore #6
/*     */     //   61: aload #5
/*     */     //   63: aload_1
/*     */     //   64: <illegal opcode> subscribe : (Ljava/util/ArrayList;)Lcom/intellij/openapi/ui/validation/DialogValidationRequestor;
/*     */     //   69: invokeinterface validationRequestor : (Lcom/intellij/openapi/ui/validation/DialogValidationRequestor;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   74: pop
/*     */     //   75: nop
/*     */     //   76: nop
/*     */     //   77: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   80: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #41	-> 7
/*     */     //   #42	-> 14
/*     */     //   #45	-> 20
/*     */     //   #41	-> 23
/*     */     //   #47	-> 24
/*     */     //   #48	-> 34
/*     */     //   #49	-> 39
/*     */     //   #55	-> 54
/*     */     //   #56	-> 61
/*     */     //   #61	-> 75
/*     */     //   #55	-> 76
/*     */     //   #62	-> 77
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   61	15	6	$i$a$-apply-RadioButtonGroupBlock$addToPanel$1$1$1$2	I
/*     */     //   58	18	5	$this$addToPanel_u24lambda_u2418_u24lambda_u2417_u24lambda_u246_u24lambda_u245	Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   24	57	3	errorMessage	Ljava/lang/String;
/*     */     //   0	81	0	this$0	Lfeedback/RadioButtonGroupBlock;
/*     */     //   0	81	1	$allButtons	Ljava/util/ArrayList;
/*     */     //   0	81	2	$this$row	Lcom/intellij/ui/dsl/builder/Row;
/*     */   }
/*     */   
/*     */   private static final boolean addToPanel$lambda$18$lambda$17$lambda$6$lambda$2(RadioButtonGroupBlock this$0, ArrayList $allButtons, JLabel it) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w 'it'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield myIncludeOtherTextField : Z
/*     */     //   11: ifeq -> 199
/*     */     //   14: aload_1
/*     */     //   15: checkcast java/lang/Iterable
/*     */     //   18: astore_3
/*     */     //   19: iconst_0
/*     */     //   20: istore #4
/*     */     //   22: aload_3
/*     */     //   23: instanceof java/util/Collection
/*     */     //   26: ifeq -> 45
/*     */     //   29: aload_3
/*     */     //   30: checkcast java/util/Collection
/*     */     //   33: invokeinterface isEmpty : ()Z
/*     */     //   38: ifeq -> 45
/*     */     //   41: iconst_1
/*     */     //   42: goto -> 103
/*     */     //   45: aload_3
/*     */     //   46: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   51: astore #5
/*     */     //   53: aload #5
/*     */     //   55: invokeinterface hasNext : ()Z
/*     */     //   60: ifeq -> 102
/*     */     //   63: aload #5
/*     */     //   65: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   70: astore #6
/*     */     //   72: aload #6
/*     */     //   74: checkcast com/intellij/ui/components/JBRadioButton
/*     */     //   77: astore #7
/*     */     //   79: iconst_0
/*     */     //   80: istore #8
/*     */     //   82: aload #7
/*     */     //   84: invokevirtual isSelected : ()Z
/*     */     //   87: ifne -> 94
/*     */     //   90: iconst_1
/*     */     //   91: goto -> 95
/*     */     //   94: iconst_0
/*     */     //   95: ifne -> 53
/*     */     //   98: iconst_0
/*     */     //   99: goto -> 103
/*     */     //   102: iconst_1
/*     */     //   103: ifeq -> 199
/*     */     //   106: aload_0
/*     */     //   107: getfield otherRadioButton : Lcom/intellij/ui/components/JBRadioButton;
/*     */     //   110: dup
/*     */     //   111: ifnull -> 128
/*     */     //   114: invokevirtual isSelected : ()Z
/*     */     //   117: ifne -> 124
/*     */     //   120: iconst_1
/*     */     //   121: goto -> 130
/*     */     //   124: iconst_0
/*     */     //   125: goto -> 130
/*     */     //   128: pop
/*     */     //   129: iconst_0
/*     */     //   130: ifne -> 199
/*     */     //   133: aload_0
/*     */     //   134: getfield otherRadioButton : Lcom/intellij/ui/components/JBRadioButton;
/*     */     //   137: dup
/*     */     //   138: ifnull -> 156
/*     */     //   141: invokevirtual isSelected : ()Z
/*     */     //   144: iconst_1
/*     */     //   145: if_icmpne -> 152
/*     */     //   148: iconst_1
/*     */     //   149: goto -> 158
/*     */     //   152: iconst_0
/*     */     //   153: goto -> 158
/*     */     //   156: pop
/*     */     //   157: iconst_0
/*     */     //   158: ifeq -> 199
/*     */     //   161: aload_0
/*     */     //   162: getfield otherTextField : Lcom/intellij/ui/components/JBTextField;
/*     */     //   165: dup
/*     */     //   166: ifnull -> 194
/*     */     //   169: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   172: dup
/*     */     //   173: ifnull -> 194
/*     */     //   176: checkcast java/lang/CharSequence
/*     */     //   179: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   182: iconst_1
/*     */     //   183: if_icmpne -> 190
/*     */     //   186: iconst_1
/*     */     //   187: goto -> 196
/*     */     //   190: iconst_0
/*     */     //   191: goto -> 196
/*     */     //   194: pop
/*     */     //   195: iconst_0
/*     */     //   196: ifeq -> 199
/*     */     //   199: aload_0
/*     */     //   200: getfield requireAnswer : Z
/*     */     //   203: ifeq -> 302
/*     */     //   206: aload_1
/*     */     //   207: checkcast java/lang/Iterable
/*     */     //   210: astore_3
/*     */     //   211: iconst_0
/*     */     //   212: istore #4
/*     */     //   214: aload_3
/*     */     //   215: instanceof java/util/Collection
/*     */     //   218: ifeq -> 237
/*     */     //   221: aload_3
/*     */     //   222: checkcast java/util/Collection
/*     */     //   225: invokeinterface isEmpty : ()Z
/*     */     //   230: ifeq -> 237
/*     */     //   233: iconst_1
/*     */     //   234: goto -> 295
/*     */     //   237: aload_3
/*     */     //   238: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   243: astore #5
/*     */     //   245: aload #5
/*     */     //   247: invokeinterface hasNext : ()Z
/*     */     //   252: ifeq -> 294
/*     */     //   255: aload #5
/*     */     //   257: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   262: astore #6
/*     */     //   264: aload #6
/*     */     //   266: checkcast com/intellij/ui/components/JBRadioButton
/*     */     //   269: astore #7
/*     */     //   271: iconst_0
/*     */     //   272: istore #8
/*     */     //   274: aload #7
/*     */     //   276: invokevirtual isSelected : ()Z
/*     */     //   279: ifne -> 286
/*     */     //   282: iconst_1
/*     */     //   283: goto -> 287
/*     */     //   286: iconst_0
/*     */     //   287: ifne -> 245
/*     */     //   290: iconst_0
/*     */     //   291: goto -> 295
/*     */     //   294: iconst_1
/*     */     //   295: ifeq -> 302
/*     */     //   298: iconst_1
/*     */     //   299: goto -> 303
/*     */     //   302: iconst_0
/*     */     //   303: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 7
/*     */     //   #51	-> 14
/*     */     //   #184	-> 22
/*     */     //   #185	-> 45
/*     */     //   #51	-> 82
/*     */     //   #185	-> 95
/*     */     //   #186	-> 102
/*     */     //   #51	-> 103
/*     */     //   #52	-> 133
/*     */     //   #54	-> 199
/*     */     //   #187	-> 214
/*     */     //   #188	-> 237
/*     */     //   #54	-> 274
/*     */     //   #188	-> 287
/*     */     //   #189	-> 294
/*     */     //   #54	-> 295
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   82	13	8	$i$a$-all-RadioButtonGroupBlock$addToPanel$1$1$1$1$1	I
/*     */     //   79	16	7	it	Lcom/intellij/ui/components/JBRadioButton;
/*     */     //   72	30	6	element$iv	Ljava/lang/Object;
/*     */     //   22	81	4	$i$f$all	I
/*     */     //   19	84	3	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   274	13	8	$i$a$-all-RadioButtonGroupBlock$addToPanel$1$1$1$1$2	I
/*     */     //   271	16	7	it	Lcom/intellij/ui/components/JBRadioButton;
/*     */     //   264	30	6	element$iv	Ljava/lang/Object;
/*     */     //   214	81	4	$i$f$all	I
/*     */     //   211	84	3	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   0	304	0	this$0	Lfeedback/RadioButtonGroupBlock;
/*     */     //   0	304	1	$allButtons	Ljava/util/ArrayList;
/*     */     //   0	304	2	it	Ljavax/swing/JLabel;
/*     */   }
/*     */   
/*     */   private static final void addToPanel$lambda$18$lambda$17$lambda$6$lambda$5$lambda$4(ArrayList $allButtons, Disposable parentDisposable, Function0 validate) {
/*  57 */     Intrinsics.checkNotNullParameter(validate, "validate"); Iterable $this$forEach$iv = $allButtons; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 190 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); JBRadioButton it = (JBRadioButton)element$iv; int $i$a$-forEach-RadioButtonGroupBlock$addToPanel$1$1$1$2$1$1 = 0;
/*     */       RequestorsKt.getWHEN_STATE_CHANGED().invoke(it).subscribe(parentDisposable, validate); }
/*     */   
/*     */   }
/*     */   
/*     */   private static final Unit addToPanel$lambda$18$lambda$17$lambda$12$lambda$10(RadioButtonItemData $itemData, RadioButtonGroupBlock this$0, int $i, ArrayList $allButtons, Row $this$row) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: ldc_w '$this$row'
/*     */     //   5: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   8: aload #4
/*     */     //   10: aload_0
/*     */     //   11: invokevirtual getLabel : ()Ljava/lang/String;
/*     */     //   14: aconst_null
/*     */     //   15: iconst_2
/*     */     //   16: aconst_null
/*     */     //   17: invokestatic radioButton$default : (Lcom/intellij/ui/dsl/builder/Row;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   20: aload_1
/*     */     //   21: iload_2
/*     */     //   22: <illegal opcode> invoke : (Lfeedback/RadioButtonGroupBlock;I)Lkotlin/jvm/functions/Function0;
/*     */     //   27: aload_1
/*     */     //   28: iload_2
/*     */     //   29: <illegal opcode> invoke : (Lfeedback/RadioButtonGroupBlock;I)Lkotlin/jvm/functions/Function1;
/*     */     //   34: invokestatic bindSelected : (Lcom/intellij/ui/dsl/builder/Cell;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   37: aload_3
/*     */     //   38: <illegal opcode> invoke : (Ljava/util/ArrayList;)Lkotlin/jvm/functions/Function1;
/*     */     //   43: invokeinterface applyToComponent : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   48: pop
/*     */     //   49: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   52: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #65	-> 8
/*     */     //   #68	-> 37
/*     */     //   #71	-> 49
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	53	0	$itemData	Lfeedback/RadioButtonItemData;
/*     */     //   0	53	1	this$0	Lfeedback/RadioButtonGroupBlock;
/*     */     //   0	53	2	$i	I
/*     */     //   0	53	3	$allButtons	Ljava/util/ArrayList;
/*     */     //   0	53	4	$this$row	Lcom/intellij/ui/dsl/builder/Row;
/*     */   }
/*     */   
/*     */   private static final boolean addToPanel$lambda$18$lambda$17$lambda$12$lambda$10$lambda$7(RadioButtonGroupBlock this$0, int $i) {
/*     */     return ((RadioButtonItemData)this$0.myItemsData.get($i)).getProperty$ej_ui();
/*     */   }
/*     */   
/*     */   private static final Unit addToPanel$lambda$18$lambda$17$lambda$12$lambda$10$lambda$8(RadioButtonGroupBlock this$0, int $i, boolean it) {
/*     */     ((RadioButtonItemData)this$0.myItemsData.get($i)).setProperty$ej_ui(it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit addToPanel$lambda$18$lambda$17$lambda$12$lambda$10$lambda$9(ArrayList<JBRadioButton> $allButtons, JBRadioButton $this$applyToComponent) {
/*     */     Intrinsics.checkNotNullParameter($this$applyToComponent, "$this$applyToComponent");
/*     */     $allButtons.add($this$applyToComponent);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit addToPanel$lambda$18$lambda$17$lambda$16(RadioButtonGroupBlock this$0, Row $this$row) {
/*     */     Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */     $this$row.cell((JComponent)new JBRadioButton()).applyToComponent(this$0::addToPanel$lambda$18$lambda$17$lambda$16$lambda$13);
/*     */     Intrinsics.checkNotNull(this$0.otherRadioButton);
/*     */     TextFieldKt.bindText($this$row.textField(), MutablePropertyKt.toMutableProperty((KMutableProperty0)new RadioButtonGroupBlock$addToPanel$1$1$3$2(this$0))).align(Align.FILL).enabledIf(ComponentPredicateKt.getSelected((AbstractButton)this$0.otherRadioButton)).applyToComponent(this$0::addToPanel$lambda$18$lambda$17$lambda$16$lambda$14);
/*     */     JBRadioButton jBRadioButton1 = this$0.otherRadioButton, $this$addToPanel_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416_u24lambda_u2415 = jBRadioButton1;
/*     */     int $i$a$-apply-RadioButtonGroupBlock$addToPanel$1$1$3$4 = 0;
/*     */     $this$addToPanel_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416_u24lambda_u2415.addChangeListener(new RadioButtonGroupBlock$addToPanel$1$1$3$4$1());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit addToPanel$lambda$18$lambda$17$lambda$16$lambda$13(RadioButtonGroupBlock this$0, JBRadioButton $this$applyToComponent) {
/*     */     Intrinsics.checkNotNullParameter($this$applyToComponent, "$this$applyToComponent");
/*     */     $this$applyToComponent.setOpaque(false);
/*     */     this$0.otherRadioButton = $this$applyToComponent;
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit addToPanel$lambda$18$lambda$17$lambda$16$lambda$14(RadioButtonGroupBlock this$0, JBTextField $this$applyToComponent) {
/*     */     Intrinsics.checkNotNullParameter($this$applyToComponent, "$this$applyToComponent");
/*     */     $this$applyToComponent.getEmptyText().setText(this$0.otherTextfieldPlaceholderText);
/*     */     this$0.otherTextField = $this$applyToComponent;
/*     */     $this$applyToComponent.addFocusListener(new RadioButtonGroupBlock$addToPanel$1$1$3$3$1($this$applyToComponent));
/*     */     $this$applyToComponent.addMouseListener(new RadioButtonGroupBlock$addToPanel$1$1$3$3$2($this$applyToComponent));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026J\022\020\006\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\007"}, d2 = {"feedback/RadioButtonGroupBlock$addToPanel$1$1$3$3$1", "Ljava/awt/event/FocusListener;", "focusGained", "", "e", "Ljava/awt/event/FocusEvent;", "focusLost", "ej-ui"})
/*     */   public static final class RadioButtonGroupBlock$addToPanel$1$1$3$3$1 implements FocusListener {
/*     */     RadioButtonGroupBlock$addToPanel$1$1$3$3$1(JBTextField $this_applyToComponent) {}
/*     */     
/*     */     public void focusGained(FocusEvent e) {}
/*     */     
/*     */     public void focusLost(FocusEvent e) {
/*     */       if (Intrinsics.areEqual((e != null) ? e.getOppositeComponent() : null, RadioButtonGroupBlock.this.otherRadioButton))
/*     */         return; 
/*     */       Intrinsics.checkNotNullExpressionValue(this.$this_applyToComponent.getText(), "getText(...)");
/*     */       if (StringsKt.isBlank(this.$this_applyToComponent.getText()))
/*     */         if (RadioButtonGroupBlock.this.otherRadioButton != null) {
/*     */           RadioButtonGroupBlock.this.otherRadioButton.setSelected(false);
/*     */         } else {
/*     */           RadioButtonGroupBlock.this.otherRadioButton;
/*     */         }  
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\006"}, d2 = {"feedback/RadioButtonGroupBlock$addToPanel$1$1$3$3$2", "Ljava/awt/event/MouseAdapter;", "mouseClicked", "", "e", "Ljava/awt/event/MouseEvent;", "ej-ui"})
/*     */   public static final class RadioButtonGroupBlock$addToPanel$1$1$3$3$2 extends MouseAdapter {
/*     */     RadioButtonGroupBlock$addToPanel$1$1$3$3$2(JBTextField $this_applyToComponent) {}
/*     */     
/*     */     public void mouseClicked(MouseEvent e) {
/*     */       if (RadioButtonGroupBlock.this.otherRadioButton != null) {
/*     */         RadioButtonGroupBlock.this.otherRadioButton.setSelected(true);
/*     */       } else {
/*     */         RadioButtonGroupBlock.this.otherRadioButton;
/*     */       } 
/*     */       this.$this_applyToComponent.requestFocusInWindow();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\006"}, d2 = {"feedback/RadioButtonGroupBlock$addToPanel$1$1$3$4$1", "Ljavax/swing/event/ChangeListener;", "stateChanged", "", "e", "Ljavax/swing/event/ChangeEvent;", "ej-ui"})
/*     */   public static final class RadioButtonGroupBlock$addToPanel$1$1$3$4$1 implements ChangeListener {
/*     */     public void stateChanged(ChangeEvent e) {
/*     */       Object sourceState;
/*     */       if (e == null || e.getSource() == null) {
/*     */         e.getSource();
/*     */         return;
/*     */       } 
/*     */       if (sourceState instanceof com.intellij.ui.components.JBCheckBox && ((Boolean)ComponentPredicateKt.getSelected((AbstractButton)sourceState).invoke()).booleanValue())
/*     */         if (RadioButtonGroupBlock.this.otherTextField != null) {
/*     */           RadioButtonGroupBlock.this.otherTextField.requestFocusInWindow();
/*     */         } else {
/*     */           RadioButtonGroupBlock.this.otherTextField;
/*     */         }  
/*     */     }
/*     */   }
/*     */   
/*     */   public void collectBlockTextDescription(@NotNull StringBuilder stringBuilder) {
/*     */     Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
/*     */     StringBuilder stringBuilder1 = stringBuilder, $this$collectBlockTextDescription_u24lambda_u2420 = stringBuilder1;
/*     */     int $i$a$-apply-RadioButtonGroupBlock$collectBlockTextDescription$1 = 0;
/*     */     Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u2420.append(this.myGroupLabel), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u2420.append(this.myGroupLabel).append('\n'), "append(...)");
/*     */     $this$collectBlockTextDescription_u24lambda_u2420.append(this.myGroupLabel).append('\n');
/*     */     Iterable<RadioButtonItemData> $this$forEach$iv = this.myItemsData;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator<RadioButtonItemData> iterator = $this$forEach$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       RadioButtonItemData itemData = (RadioButtonItemData)element$iv;
/*     */       int $i$a$-forEach-RadioButtonGroupBlock$collectBlockTextDescription$1$1 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u2420.append(" " + itemData.getLabel() + " - " + itemData.getProperty$ej_ui()), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u2420.append(" " + itemData.getLabel() + " - " + itemData.getProperty$ej_ui()).append('\n'), "append(...)");
/*     */       $this$collectBlockTextDescription_u24lambda_u2420.append(" " + itemData.getLabel() + " - " + itemData.getProperty$ej_ui()).append('\n');
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u2420.append('\n'), "append(...)");
/*     */     $this$collectBlockTextDescription_u24lambda_u2420.append('\n');
/*     */     if (this.myIncludeOtherTextField)
/*     */       if ((this.otherRadioButton != null) ? ((this.otherRadioButton.isSelected() == true)) : false) {
/*     */         this.otherTextField.getText();
/*     */         if ((this.otherTextField != null && this.otherTextField.getText() != null) ? (!StringsKt.isBlank(this.otherTextField.getText())) : false) {
/*     */           Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u2420.append(" Other: " + this.otherProperty), "append(...)");
/*     */           Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u2420.append(" Other: " + this.otherProperty).append('\n'), "append(...)");
/*     */           $this$collectBlockTextDescription_u24lambda_u2420.append(" Other: " + this.otherProperty).append('\n');
/*     */         } 
/*     */       }  
/*     */     Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u2420.append('\n'), "append(...)");
/*     */     $this$collectBlockTextDescription_u24lambda_u2420.append('\n');
/*     */   }
/*     */   
/*     */   public void collectBlockDataToJson(@NotNull JsonObjectBuilder jsonObjectBuilder) {
/*     */     Intrinsics.checkNotNullParameter(jsonObjectBuilder, "jsonObjectBuilder");
/*     */     JsonObjectBuilder jsonObjectBuilder1 = jsonObjectBuilder, $this$collectBlockDataToJson_u24lambda_u2423 = jsonObjectBuilder1;
/*     */     int $i$a$-apply-RadioButtonGroupBlock$collectBlockDataToJson$1 = 0;
/*     */     int $i$f$buildJsonObject = 0;
/*     */     JsonObjectBuilder builder$iv = new JsonObjectBuilder();
/*     */     JsonObjectBuilder jsonObjectBuilder2 = builder$iv;
/*     */     String str = this.myJsonGroupName;
/*     */     JsonObjectBuilder jsonObjectBuilder3 = $this$collectBlockDataToJson_u24lambda_u2423;
/*     */     int $i$a$-buildJsonObject-RadioButtonGroupBlock$collectBlockDataToJson$1$1 = 0;
/*     */     Iterable<RadioButtonItemData> $this$forEach$iv = this.myItemsData;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator<RadioButtonItemData> iterator = $this$forEach$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       RadioButtonItemData itemData = (RadioButtonItemData)element$iv;
/*     */       int $i$a$-forEach-RadioButtonGroupBlock$collectBlockDataToJson$1$1$1 = 0;
/*     */       JsonElementBuildersKt.put(jsonObjectBuilder2, itemData.getJsonElementName(), Boolean.valueOf(itemData.getProperty$ej_ui()));
/*     */     } 
/*     */     if (this.myIncludeOtherTextField)
/*     */       if ((this.otherRadioButton != null) ? ((this.otherRadioButton.isSelected() == true)) : false) {
/*     */         this.otherTextField.getText();
/*     */         if ((this.otherTextField != null && this.otherTextField.getText() != null) ? (!StringsKt.isBlank(this.otherTextField.getText())) : false)
/*     */           JsonElementBuildersKt.put(jsonObjectBuilder2, "other", this.otherProperty); 
/*     */       }  
/*     */     Unit unit = Unit.INSTANCE;
/*     */     jsonObjectBuilder3.put(str, (JsonElement)builder$iv.build());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RadioButtonGroupBlock addOtherTextField(@NotNull String placeholderText) {
/*     */     Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
/*     */     this.myIncludeOtherTextField = true;
/*     */     this.otherTextfieldPlaceholderText = placeholderText;
/*     */     return this;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RadioButtonGroupBlock requireAnswer() {
/*     */     this.requireAnswer = true;
/*     */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\RadioButtonGroupBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */