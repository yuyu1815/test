/*     */ package feedback;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ui.components.JBTextArea;
/*     */ import com.intellij.ui.dsl.builder.BottomGap;
/*     */ import com.intellij.ui.dsl.builder.Panel;
/*     */ import com.intellij.ui.dsl.builder.Row;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.MutablePropertyReference0Impl;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.json.JsonElementBuildersKt;
/*     */ import kotlinx.serialization.json.JsonObjectBuilder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\020\b\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\b\007\030\0002\0020\0012\0020\0022\0020\003B\027\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\004\b\007\020\bJ\020\020\016\032\0020\0172\006\020\020\032\0020\021H\026J\024\020\022\032\0020\0172\n\020\023\032\0060\024j\002`\025H\026J\020\020\026\032\0020\0172\006\020\027\032\0020\030H\026J\016\020\031\032\0020\0002\006\020\032\032\0020\013J\016\020\033\032\0020\0002\006\020\034\032\0020\005J\016\020\035\032\0020\0002\006\020\036\032\0020\005R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\005X\004¢\006\002\n\000R\016\020\t\032\0020\005X\016¢\006\002\n\000R\016\020\n\032\0020\013X\016¢\006\002\n\000R\020\020\f\032\004\030\0010\005X\016¢\006\002\n\000R\020\020\r\032\004\030\0010\005X\016¢\006\002\n\000¨\006\037"}, d2 = {"Lfeedback/TextAreaBlock;", "Lfeedback/FeedbackBlock;", "Lfeedback/TextDescriptionProvider;", "Lfeedback/JsonDataProvider;", "myLabel", "", "myJsonElementName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "myProperty", "myTextAreaRowSize", "", "myRequireNotEmptyMessage", "myPlaceholder", "addToPanel", "", "panel", "Lcom/intellij/ui/dsl/builder/Panel;", "collectBlockTextDescription", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "collectBlockDataToJson", "jsonObjectBuilder", "Lkotlinx/serialization/json/JsonObjectBuilder;", "setRowSize", "rowSize", "requireNotEmpty", "requireNotEmptyMessage", "setPlaceholder", "placeholder", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nTextAreaBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAreaBlock.kt\nfeedback/TextAreaBlock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1863#2,2:105\n*S KotlinDebug\n*F\n+ 1 TextAreaBlock.kt\nfeedback/TextAreaBlock\n*L\n67#1:105,2\n*E\n"})
/*     */ public final class TextAreaBlock
/*     */   implements FeedbackBlock, TextDescriptionProvider, JsonDataProvider
/*     */ {
/*     */   @NotNull
/*     */   private final String myLabel;
/*     */   @NotNull
/*     */   private final String myJsonElementName;
/*     */   @NotNull
/*     */   private String myProperty;
/*     */   private int myTextAreaRowSize;
/*     */   @Nullable
/*     */   private String myRequireNotEmptyMessage;
/*     */   @Nullable
/*     */   private String myPlaceholder;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public TextAreaBlock(@NotNull String myLabel, @NotNull String myJsonElementName) {
/*  39 */     this.myLabel = myLabel;
/*  40 */     this.myJsonElementName = myJsonElementName;
/*  41 */     this.myProperty = "";
/*  42 */     this.myTextAreaRowSize = 5;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void addToPanel(@NotNull Panel panel) {
/*  48 */     Intrinsics.checkNotNullParameter(panel, "panel"); Panel panel1 = panel, $this$addToPanel_u24lambda_u245 = panel1; int $i$a$-apply-TextAreaBlock$addToPanel$1 = 0;
/*  49 */     Panel.row$default($this$addToPanel_u24lambda_u245, null, this::addToPanel$lambda$5$lambda$4, 1, null)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  72 */       .bottomGap(BottomGap.MEDIUM);
/*     */   }
/*     */   private static final Unit addToPanel$lambda$5$lambda$4(TextAreaBlock this$0, Row $this$row) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$row'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: invokeinterface textArea : ()Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   12: new feedback/TextAreaBlock$addToPanel$1$1$1
/*     */     //   15: dup
/*     */     //   16: aload_0
/*     */     //   17: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   20: checkcast kotlin/reflect/KMutableProperty0
/*     */     //   23: invokestatic bindText : (Lcom/intellij/ui/dsl/builder/Cell;Lkotlin/reflect/KMutableProperty0;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   26: aload_0
/*     */     //   27: getfield myTextAreaRowSize : I
/*     */     //   30: invokestatic rows : (Lcom/intellij/ui/dsl/builder/Cell;I)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   33: getstatic com/intellij/ui/dsl/builder/Align.FILL : Lcom/intellij/ui/dsl/builder/Align;
/*     */     //   36: invokeinterface align : (Lcom/intellij/ui/dsl/builder/Align;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   41: aload_0
/*     */     //   42: getfield myLabel : Ljava/lang/String;
/*     */     //   45: invokestatic createBoldJBLabel : (Ljava/lang/String;)Lcom/intellij/ui/components/JBLabel;
/*     */     //   48: checkcast javax/swing/JLabel
/*     */     //   51: getstatic com/intellij/ui/dsl/builder/LabelPosition.TOP : Lcom/intellij/ui/dsl/builder/LabelPosition;
/*     */     //   54: invokeinterface label : (Ljavax/swing/JLabel;Lcom/intellij/ui/dsl/builder/LabelPosition;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   59: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   64: invokeinterface applyToComponent : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   69: astore_2
/*     */     //   70: aload_2
/*     */     //   71: astore_3
/*     */     //   72: iconst_0
/*     */     //   73: istore #4
/*     */     //   75: aload_0
/*     */     //   76: getfield myRequireNotEmptyMessage : Ljava/lang/String;
/*     */     //   79: ifnull -> 102
/*     */     //   82: aload_3
/*     */     //   83: aload_0
/*     */     //   84: getfield myRequireNotEmptyMessage : Ljava/lang/String;
/*     */     //   87: dup
/*     */     //   88: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   91: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   96: invokeinterface errorOnApply : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   101: pop
/*     */     //   102: aload_0
/*     */     //   103: getfield myPlaceholder : Ljava/lang/String;
/*     */     //   106: ifnull -> 239
/*     */     //   109: aload_3
/*     */     //   110: invokeinterface getComponent : ()Ljavax/swing/JComponent;
/*     */     //   115: checkcast com/intellij/ui/components/JBTextArea
/*     */     //   118: invokevirtual getEmptyText : ()Lcom/intellij/util/ui/StatusText;
/*     */     //   121: dup
/*     */     //   122: ldc_w 'getEmptyText(...)'
/*     */     //   125: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   128: astore #5
/*     */     //   130: aload #5
/*     */     //   132: iconst_0
/*     */     //   133: invokevirtual setCenterAlignText : (Z)V
/*     */     //   136: aload_0
/*     */     //   137: getfield myPlaceholder : Ljava/lang/String;
/*     */     //   140: dup
/*     */     //   141: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   144: checkcast java/lang/CharSequence
/*     */     //   147: iconst_1
/*     */     //   148: anewarray java/lang/String
/*     */     //   151: astore #6
/*     */     //   153: aload #6
/*     */     //   155: iconst_0
/*     */     //   156: ldc_w '\\n'
/*     */     //   159: aastore
/*     */     //   160: aload #6
/*     */     //   162: iconst_0
/*     */     //   163: iconst_0
/*     */     //   164: bipush #6
/*     */     //   166: aconst_null
/*     */     //   167: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   170: checkcast java/lang/Iterable
/*     */     //   173: astore #6
/*     */     //   175: iconst_0
/*     */     //   176: istore #7
/*     */     //   178: aload #6
/*     */     //   180: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   185: astore #8
/*     */     //   187: aload #8
/*     */     //   189: invokeinterface hasNext : ()Z
/*     */     //   194: ifeq -> 238
/*     */     //   197: aload #8
/*     */     //   199: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   204: astore #9
/*     */     //   206: aload #9
/*     */     //   208: checkcast java/lang/String
/*     */     //   211: astore #10
/*     */     //   213: iconst_0
/*     */     //   214: istore #11
/*     */     //   216: aload #5
/*     */     //   218: aload #10
/*     */     //   220: checkcast java/lang/CharSequence
/*     */     //   223: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   226: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   229: invokevirtual appendLine : (Ljava/lang/String;)Lcom/intellij/util/ui/StatusText;
/*     */     //   232: pop
/*     */     //   233: nop
/*     */     //   234: nop
/*     */     //   235: goto -> 187
/*     */     //   238: nop
/*     */     //   239: nop
/*     */     //   240: nop
/*     */     //   241: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   244: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 6
/*     */     //   #51	-> 12
/*     */     //   #52	-> 26
/*     */     //   #53	-> 33
/*     */     //   #54	-> 41
/*     */     //   #55	-> 64
/*     */     //   #58	-> 70
/*     */     //   #59	-> 75
/*     */     //   #60	-> 82
/*     */     //   #64	-> 102
/*     */     //   #65	-> 109
/*     */     //   #66	-> 130
/*     */     //   #67	-> 136
/*     */     //   #105	-> 178
/*     */     //   #68	-> 216
/*     */     //   #68	-> 229
/*     */     //   #69	-> 233
/*     */     //   #105	-> 234
/*     */     //   #106	-> 238
/*     */     //   #71	-> 239
/*     */     //   #58	-> 240
/*     */     //   #72	-> 241
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   216	18	11	$i$a$-forEach-TextAreaBlock$addToPanel$1$1$3$2	I
/*     */     //   213	21	10	it	Ljava/lang/String;
/*     */     //   206	29	9	element$iv	Ljava/lang/Object;
/*     */     //   178	61	7	$i$f$forEach	I
/*     */     //   175	64	6	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   130	109	5	emptyText	Lcom/intellij/util/ui/StatusText;
/*     */     //   75	165	4	$i$a$-apply-TextAreaBlock$addToPanel$1$1$3	I
/*     */     //   72	168	3	$this$addToPanel_u24lambda_u245_u24lambda_u244_u24lambda_u243	Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   0	245	0	this$0	Lfeedback/TextAreaBlock;
/*     */     //   0	245	1	$this$row	Lcom/intellij/ui/dsl/builder/Row;
/*     */   }
/*  77 */   public void collectBlockTextDescription(@NotNull StringBuilder stringBuilder) { Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder"); StringBuilder stringBuilder1 = stringBuilder, $this$collectBlockTextDescription_u24lambda_u246 = stringBuilder1; int $i$a$-apply-TextAreaBlock$collectBlockTextDescription$1 = 0;
/*  78 */     Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u246.append(this.myLabel), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u246.append(this.myLabel).append('\n'), "append(...)"); $this$collectBlockTextDescription_u24lambda_u246.append(this.myLabel).append('\n');
/*  79 */     Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u246.append(this.myProperty), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u246.append(this.myProperty).append('\n'), "append(...)"); $this$collectBlockTextDescription_u24lambda_u246.append(this.myProperty).append('\n');
/*  80 */     Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u246.append('\n'), "append(...)"); $this$collectBlockTextDescription_u24lambda_u246.append('\n'); }
/*     */   private static final Unit addToPanel$lambda$5$lambda$4$lambda$0(JBTextArea $this$applyToComponent) {
/*     */     Intrinsics.checkNotNullParameter($this$applyToComponent, "$this$applyToComponent");
/*     */     TextAreaBlockKt.adjustBehaviourForFeedbackForm($this$applyToComponent);
/*     */     return Unit.INSTANCE;
/*  85 */   } public void collectBlockDataToJson(@NotNull JsonObjectBuilder jsonObjectBuilder) { Intrinsics.checkNotNullParameter(jsonObjectBuilder, "jsonObjectBuilder"); JsonObjectBuilder jsonObjectBuilder1 = jsonObjectBuilder, $this$collectBlockDataToJson_u24lambda_u247 = jsonObjectBuilder1; int $i$a$-apply-TextAreaBlock$collectBlockDataToJson$1 = 0;
/*  86 */     JsonElementBuildersKt.put($this$collectBlockDataToJson_u24lambda_u247, this.myJsonElementName, this.myProperty); }
/*     */   private static final boolean addToPanel$lambda$5$lambda$4$lambda$3$lambda$1(JBTextArea it) { Intrinsics.checkNotNullParameter(it, "it");
/*     */     Intrinsics.checkNotNullExpressionValue(it.getText(), "getText(...)");
/*     */     return StringsKt.isBlank(it.getText()); } @NotNull
/*     */   public final TextAreaBlock setRowSize(int rowSize) {
/*  91 */     this.myTextAreaRowSize = rowSize;
/*  92 */     return this;
/*     */   }
/*     */   @NotNull
/*     */   public final TextAreaBlock requireNotEmpty(@NotNull String requireNotEmptyMessage) {
/*  96 */     Intrinsics.checkNotNullParameter(requireNotEmptyMessage, "requireNotEmptyMessage"); this.myRequireNotEmptyMessage = requireNotEmptyMessage;
/*  97 */     return this;
/*     */   }
/*     */   @NotNull
/*     */   public final TextAreaBlock setPlaceholder(@NotNull String placeholder) {
/* 101 */     Intrinsics.checkNotNullParameter(placeholder, "placeholder"); this.myPlaceholder = placeholder;
/* 102 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\TextAreaBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */