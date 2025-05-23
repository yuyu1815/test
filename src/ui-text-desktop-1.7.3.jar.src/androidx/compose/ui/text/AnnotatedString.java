/*      */ package androidx.compose.ui.text;
/*      */ 
/*      */ import androidx.compose.runtime.Immutable;
/*      */ import androidx.compose.runtime.Stable;
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import androidx.compose.runtime.saveable.Saver;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import kotlin.Deprecated;
/*      */ import kotlin.DeprecationLevel;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.ReplaceWith;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.jvm.JvmName;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\020\r\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\000\n\002\b\004\n\002\020\b\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\f\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\t\b\007\030\000 :2\0020\001:\0039:;B;\b\026\022\006\020\002\032\0020\003\022\024\b\002\020\004\032\016\022\n\022\b\022\004\022\0020\0070\0060\005\022\024\b\002\020\b\032\016\022\n\022\b\022\004\022\0020\t0\0060\005¢\006\002\020\nBY\b\000\022\006\020\002\032\0020\003\022\026\b\002\020\013\032\020\022\n\022\b\022\004\022\0020\0070\006\030\0010\005\022\026\b\002\020\f\032\020\022\n\022\b\022\004\022\0020\t0\006\030\0010\005\022\030\b\002\020\r\032\022\022\f\022\n\022\006\b\001\022\0020\0160\006\030\0010\005¢\006\002\020\017J\023\020\034\032\0020\0352\b\020\036\032\004\030\0010\016H\002J\021\020\037\032\0020 2\006\020!\032\0020\023H\002J\"\020\"\032\016\022\n\022\b\022\004\022\0020#0\0060\0052\006\020$\032\0020\0232\006\020%\032\0020\023J\"\020&\032\016\022\n\022\b\022\004\022\0020\0030\0060\0052\006\020$\032\0020\0232\006\020%\032\0020\023J*\020&\032\016\022\n\022\b\022\004\022\0020\0030\0060\0052\006\020'\032\0020\0032\006\020$\032\0020\0232\006\020%\032\0020\023J\"\020(\032\016\022\n\022\b\022\004\022\0020)0\0060\0052\006\020$\032\0020\0232\006\020%\032\0020\023J$\020*\032\016\022\n\022\b\022\004\022\0020+0\0060\0052\006\020$\032\0020\0232\006\020%\032\0020\023H\007J\016\020,\032\0020\0352\006\020\036\032\0020\000J\026\020-\032\0020\0352\006\020$\032\0020\0232\006\020%\032\0020\023J\036\020.\032\0020\0352\006\020'\032\0020\0032\006\020$\032\0020\0232\006\020%\032\0020\023J\b\020/\032\0020\023H\026J\021\0200\032\0020\0002\006\020\036\032\0020\000H\002J\030\0201\032\0020\0002\006\0202\032\00203ø\001\000¢\006\004\b4\0205J\030\0201\032\0020\0002\006\0206\032\0020\0232\006\0207\032\0020\023H\026J\b\0208\032\0020\003H\026R$\020\r\032\022\022\f\022\n\022\006\b\001\022\0020\0160\006\030\0010\005X\004¢\006\b\n\000\032\004\b\020\020\021R\024\020\022\032\0020\0238VX\004¢\006\006\032\004\b\024\020\025R\035\020\b\032\016\022\n\022\b\022\004\022\0020\t0\0060\0058F¢\006\006\032\004\b\026\020\021R\"\020\f\032\020\022\n\022\b\022\004\022\0020\t0\006\030\0010\005X\004¢\006\b\n\000\032\004\b\027\020\021R\035\020\004\032\016\022\n\022\b\022\004\022\0020\0070\0060\0058F¢\006\006\032\004\b\030\020\021R\"\020\013\032\020\022\n\022\b\022\004\022\0020\0070\006\030\0010\005X\004¢\006\b\n\000\032\004\b\031\020\021R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\032\020\033\002\007\n\005\b¡\0360\001¨\006<"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "text", "", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "paragraphStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "spanStylesOrNull", "paragraphStylesOrNull", "annotations", "", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAnnotations$ui_text", "()Ljava/util/List;", "length", "", "getLength", "()I", "getParagraphStyles", "getParagraphStylesOrNull$ui_text", "getSpanStyles", "getSpanStylesOrNull$ui_text", "getText", "()Ljava/lang/String;", "equals", "", "other", "get", "", "index", "getLinkAnnotations", "Landroidx/compose/ui/text/LinkAnnotation;", "start", "end", "getStringAnnotations", "tag", "getTtsAnnotations", "Landroidx/compose/ui/text/TtsAnnotation;", "getUrlAnnotations", "Landroidx/compose/ui/text/UrlAnnotation;", "hasEqualAnnotations", "hasLinkAnnotations", "hasStringAnnotations", "hashCode", "plus", "subSequence", "range", "Landroidx/compose/ui/text/TextRange;", "subSequence-5zc-tL8", "(J)Landroidx/compose/ui/text/AnnotatedString;", "startIndex", "endIndex", "toString", "Builder", "Companion", "Range", "ui-text"})
/*      */ @Immutable
/*      */ @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1270:1\n1045#2:1271\n33#3,6:1272\n235#3,3:1279\n33#3,4:1282\n238#3,2:1286\n38#3:1288\n240#3:1289\n101#3,2:1290\n33#3,6:1292\n103#3:1298\n235#3,3:1299\n33#3,4:1302\n238#3,2:1306\n38#3:1308\n240#3:1309\n235#3,3:1310\n33#3,4:1313\n238#3,2:1317\n38#3:1319\n240#3:1320\n235#3,3:1321\n33#3,4:1324\n238#3,2:1328\n38#3:1330\n240#3:1331\n235#3,3:1332\n33#3,4:1335\n238#3,2:1339\n38#3:1341\n240#3:1342\n101#3,2:1343\n33#3,6:1345\n103#3:1351\n1#4:1278\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n88#1:1271\n88#1:1272,6\n161#1:1279,3\n161#1:1282,4\n161#1:1286,2\n161#1:1288\n161#1:1289\n169#1:1290,2\n169#1:1292,6\n169#1:1298\n184#1:1299,3\n184#1:1302,4\n184#1:1306,2\n184#1:1308\n184#1:1309\n199#1:1310,3\n199#1:1313,4\n199#1:1317,2\n199#1:1319\n199#1:1320\n216#1:1321,3\n216#1:1324,4\n216#1:1328,2\n216#1:1330\n216#1:1331\n231#1:1332,3\n231#1:1335,4\n231#1:1339,2\n231#1:1341\n231#1:1342\n239#1:1343,2\n239#1:1345,6\n239#1:1351\n*E\n"})
/*      */ public final class AnnotatedString
/*      */   implements CharSequence
/*      */ {
/*      */   public AnnotatedString(@NotNull String text, @Nullable List spanStylesOrNull, @Nullable List paragraphStylesOrNull, @Nullable List annotations) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc 'text'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_0
/*      */     //   7: invokespecial <init> : ()V
/*      */     //   10: aload_0
/*      */     //   11: aload_1
/*      */     //   12: putfield text : Ljava/lang/String;
/*      */     //   15: aload_0
/*      */     //   16: aload_2
/*      */     //   17: putfield spanStylesOrNull : Ljava/util/List;
/*      */     //   20: aload_0
/*      */     //   21: aload_3
/*      */     //   22: putfield paragraphStylesOrNull : Ljava/util/List;
/*      */     //   25: aload_0
/*      */     //   26: aload #4
/*      */     //   28: putfield annotations : Ljava/util/List;
/*      */     //   31: nop
/*      */     //   32: iconst_0
/*      */     //   33: istore #5
/*      */     //   35: iconst_m1
/*      */     //   36: istore #5
/*      */     //   38: aload_0
/*      */     //   39: getfield paragraphStylesOrNull : Ljava/util/List;
/*      */     //   42: dup
/*      */     //   43: ifnull -> 258
/*      */     //   46: checkcast java/lang/Iterable
/*      */     //   49: astore #6
/*      */     //   51: iconst_0
/*      */     //   52: istore #7
/*      */     //   54: aload #6
/*      */     //   56: new androidx/compose/ui/text/AnnotatedString$special$$inlined$sortedBy$1
/*      */     //   59: dup
/*      */     //   60: invokespecial <init> : ()V
/*      */     //   63: checkcast java/util/Comparator
/*      */     //   66: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*      */     //   69: dup
/*      */     //   70: ifnull -> 258
/*      */     //   73: astore #6
/*      */     //   75: iconst_0
/*      */     //   76: istore #7
/*      */     //   78: nop
/*      */     //   79: iconst_0
/*      */     //   80: istore #8
/*      */     //   82: aload #6
/*      */     //   84: invokeinterface size : ()I
/*      */     //   89: istore #9
/*      */     //   91: iload #8
/*      */     //   93: iload #9
/*      */     //   95: if_icmpge -> 254
/*      */     //   98: aload #6
/*      */     //   100: iload #8
/*      */     //   102: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   107: astore #10
/*      */     //   109: aload #10
/*      */     //   111: checkcast androidx/compose/ui/text/AnnotatedString$Range
/*      */     //   114: astore #11
/*      */     //   116: iconst_0
/*      */     //   117: istore #12
/*      */     //   119: aload #11
/*      */     //   121: invokevirtual getStart : ()I
/*      */     //   124: iload #5
/*      */     //   126: if_icmplt -> 133
/*      */     //   129: iconst_1
/*      */     //   130: goto -> 134
/*      */     //   133: iconst_0
/*      */     //   134: ifne -> 157
/*      */     //   137: iconst_0
/*      */     //   138: istore #13
/*      */     //   140: ldc 'ParagraphStyle should not overlap'
/*      */     //   142: astore #13
/*      */     //   144: new java/lang/IllegalArgumentException
/*      */     //   147: dup
/*      */     //   148: aload #13
/*      */     //   150: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   153: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   156: athrow
/*      */     //   157: aload #11
/*      */     //   159: invokevirtual getEnd : ()I
/*      */     //   162: aload_0
/*      */     //   163: getfield text : Ljava/lang/String;
/*      */     //   166: invokevirtual length : ()I
/*      */     //   169: if_icmpgt -> 176
/*      */     //   172: iconst_1
/*      */     //   173: goto -> 177
/*      */     //   176: iconst_0
/*      */     //   177: ifne -> 239
/*      */     //   180: iconst_0
/*      */     //   181: istore #13
/*      */     //   183: new java/lang/StringBuilder
/*      */     //   186: dup
/*      */     //   187: invokespecial <init> : ()V
/*      */     //   190: ldc 'ParagraphStyle range ['
/*      */     //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   195: aload #11
/*      */     //   197: invokevirtual getStart : ()I
/*      */     //   200: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   203: ldc ', '
/*      */     //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   208: aload #11
/*      */     //   210: invokevirtual getEnd : ()I
/*      */     //   213: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   216: ldc ') is out of boundary'
/*      */     //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   221: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   224: astore #13
/*      */     //   226: new java/lang/IllegalArgumentException
/*      */     //   229: dup
/*      */     //   230: aload #13
/*      */     //   232: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   235: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   238: athrow
/*      */     //   239: aload #11
/*      */     //   241: invokevirtual getEnd : ()I
/*      */     //   244: istore #5
/*      */     //   246: nop
/*      */     //   247: nop
/*      */     //   248: iinc #8, 1
/*      */     //   251: goto -> 91
/*      */     //   254: nop
/*      */     //   255: goto -> 260
/*      */     //   258: pop
/*      */     //   259: nop
/*      */     //   260: nop
/*      */     //   261: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #35	-> 6
/*      */     //   #37	-> 10
/*      */     //   #38	-> 15
/*      */     //   #39	-> 20
/*      */     //   #40	-> 25
/*      */     //   #85	-> 31
/*      */     //   #86	-> 32
/*      */     //   #88	-> 38
/*      */     //   #1271	-> 54
/*      */     //   #1271	-> 66
/*      */     //   #88	-> 69
/*      */     //   #1272	-> 78
/*      */     //   #1273	-> 79
/*      */     //   #1274	-> 98
/*      */     //   #1275	-> 109
/*      */     //   #89	-> 119
/*      */     //   #90	-> 140
/*      */     //   #89	-> 142
/*      */     //   #92	-> 157
/*      */     //   #93	-> 183
/*      */     //   #92	-> 224
/*      */     //   #96	-> 239
/*      */     //   #97	-> 246
/*      */     //   #1275	-> 247
/*      */     //   #1273	-> 248
/*      */     //   #1277	-> 254
/*      */     //   #88	-> 258
/*      */     //   #98	-> 260
/*      */     //   #36	-> 261
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   54	15	7	$i$f$sortedBy	I
/*      */     //   51	18	6	$this$sortedBy$iv	Ljava/lang/Iterable;
/*      */     //   140	2	13	$i$a$-require-AnnotatedString$4$1	I
/*      */     //   183	41	13	$i$a$-require-AnnotatedString$4$2	I
/*      */     //   119	128	12	$i$a$-fastForEach-AnnotatedString$4	I
/*      */     //   116	131	11	paragraphStyle	Landroidx/compose/ui/text/AnnotatedString$Range;
/*      */     //   109	139	10	item$iv	Ljava/lang/Object;
/*      */     //   82	172	8	index$iv	I
/*      */     //   78	177	7	$i$f$fastForEach	I
/*      */     //   75	180	6	$this$fastForEach$iv	Ljava/util/List;
/*      */     //   35	225	5	lastStyleEnd	I
/*      */     //   0	262	0	this	Landroidx/compose/ui/text/AnnotatedString;
/*      */     //   0	262	1	text	Ljava/lang/String;
/*      */     //   0	262	2	spanStylesOrNull	Ljava/util/List;
/*      */     //   0	262	3	paragraphStylesOrNull	Ljava/util/List;
/*      */     //   0	262	4	annotations	Ljava/util/List;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final String getText() {
/*   37 */     return this.text; } @Nullable
/*   38 */   public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text() { return this.spanStylesOrNull; } @Nullable
/*   39 */   public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text() { return this.paragraphStylesOrNull; } @Nullable
/*   40 */   public final List<Range<? extends Object>> getAnnotations$ui_text() { return this.annotations; }
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final List<Range<SpanStyle>> getSpanStyles() {
/*   46 */     if (this.spanStylesOrNull == null); return CollectionsKt.emptyList();
/*      */   }
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final List<Range<ParagraphStyle>> getParagraphStyles() {
/*   52 */     if (this.paragraphStylesOrNull == null); return CollectionsKt.emptyList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnnotatedString(@NotNull String text, @NotNull List<Range<ParagraphStyle>> spanStyles, @NotNull List<Range<ParagraphStyle>> paragraphStyles) {
/*   78 */     this(
/*      */ 
/*      */         
/*   81 */         str, list1, list.isEmpty() ? list2 : list, 
/*   82 */         null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getLength() {
/*  101 */     return this.text.length();
/*      */   } public char get(int index) {
/*  103 */     return this.text.charAt(index);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public AnnotatedString subSequence(int startIndex, int endIndex) {
/*  113 */     if (!((startIndex <= endIndex) ? 1 : 0)) { int $i$a$-require-AnnotatedString$subSequence$1 = 0; String str = 
/*  114 */         "start (" + startIndex + ") should be less or equal to end (" + endIndex + ')'; throw new IllegalArgumentException(str.toString()); }
/*      */     
/*  116 */     if (startIndex == 0 && endIndex == this.text.length()) return this; 
/*  117 */     Intrinsics.checkNotNullExpressionValue(this.text.substring(startIndex, endIndex), "substring(...)"); String text = this.text.substring(startIndex, endIndex);
/*  118 */     return new AnnotatedString(
/*  119 */         text, 
/*  120 */         AnnotatedStringKt.access$filterRanges(this.spanStylesOrNull, startIndex, endIndex), 
/*  121 */         AnnotatedStringKt.access$filterRanges(this.paragraphStylesOrNull, startIndex, endIndex), 
/*  122 */         AnnotatedStringKt.access$filterRanges(this.annotations, startIndex, endIndex));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final AnnotatedString subSequence-5zc-tL8(long range) {
/*  134 */     return subSequence(TextRange.getMin-impl(range), TextRange.getMax-impl(range));
/*      */   }
/*      */   @Stable
/*      */   @NotNull
/*      */   public final AnnotatedString plus(@NotNull AnnotatedString other) {
/*  139 */     Intrinsics.checkNotNullParameter(other, "other"); Builder $this$plus_u24lambda_u247 = new Builder(this); int $i$a$-with-AnnotatedString$plus$1 = 0;
/*  140 */     $this$plus_u24lambda_u247.append(other);
/*  141 */     return $this$plus_u24lambda_u247.toAnnotatedString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final List<Range<String>> getStringAnnotations(@NotNull String tag, int start, int end) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc 'tag'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_0
/*      */     //   7: getfield annotations : Ljava/util/List;
/*      */     //   10: dup
/*      */     //   11: ifnull -> 170
/*      */     //   14: astore #4
/*      */     //   16: iconst_0
/*      */     //   17: istore #5
/*      */     //   19: nop
/*      */     //   20: new java/util/ArrayList
/*      */     //   23: dup
/*      */     //   24: aload #4
/*      */     //   26: invokeinterface size : ()I
/*      */     //   31: invokespecial <init> : (I)V
/*      */     //   34: astore #6
/*      */     //   36: aload #4
/*      */     //   38: astore #7
/*      */     //   40: iconst_0
/*      */     //   41: istore #8
/*      */     //   43: nop
/*      */     //   44: iconst_0
/*      */     //   45: istore #9
/*      */     //   47: aload #7
/*      */     //   49: invokeinterface size : ()I
/*      */     //   54: istore #10
/*      */     //   56: iload #9
/*      */     //   58: iload #10
/*      */     //   60: if_icmpge -> 161
/*      */     //   63: aload #7
/*      */     //   65: iload #9
/*      */     //   67: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   72: astore #11
/*      */     //   74: aload #11
/*      */     //   76: astore #12
/*      */     //   78: iconst_0
/*      */     //   79: istore #13
/*      */     //   81: aload #12
/*      */     //   83: checkcast androidx/compose/ui/text/AnnotatedString$Range
/*      */     //   86: astore #14
/*      */     //   88: iconst_0
/*      */     //   89: istore #15
/*      */     //   91: aload #14
/*      */     //   93: invokevirtual getItem : ()Ljava/lang/Object;
/*      */     //   96: instanceof java/lang/String
/*      */     //   99: ifeq -> 136
/*      */     //   102: aload_1
/*      */     //   103: aload #14
/*      */     //   105: invokevirtual getTag : ()Ljava/lang/String;
/*      */     //   108: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   111: ifeq -> 136
/*      */     //   114: iload_2
/*      */     //   115: iload_3
/*      */     //   116: aload #14
/*      */     //   118: invokevirtual getStart : ()I
/*      */     //   121: aload #14
/*      */     //   123: invokevirtual getEnd : ()I
/*      */     //   126: invokestatic intersect : (IIII)Z
/*      */     //   129: ifeq -> 136
/*      */     //   132: iconst_1
/*      */     //   133: goto -> 137
/*      */     //   136: iconst_0
/*      */     //   137: ifeq -> 153
/*      */     //   140: aload #6
/*      */     //   142: checkcast java/util/Collection
/*      */     //   145: aload #12
/*      */     //   147: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   152: pop
/*      */     //   153: nop
/*      */     //   154: nop
/*      */     //   155: iinc #9, 1
/*      */     //   158: goto -> 56
/*      */     //   161: nop
/*      */     //   162: aload #6
/*      */     //   164: checkcast java/util/List
/*      */     //   167: goto -> 174
/*      */     //   170: pop
/*      */     //   171: invokestatic emptyList : ()Ljava/util/List;
/*      */     //   174: dup
/*      */     //   175: ldc 'null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>'
/*      */     //   177: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   180: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #161	-> 6
/*      */     //   #1279	-> 19
/*      */     //   #1280	-> 20
/*      */     //   #1281	-> 36
/*      */     //   #1282	-> 43
/*      */     //   #1283	-> 44
/*      */     //   #1284	-> 63
/*      */     //   #1285	-> 74
/*      */     //   #1286	-> 81
/*      */     //   #162	-> 91
/*      */     //   #1286	-> 137
/*      */     //   #1287	-> 153
/*      */     //   #1285	-> 154
/*      */     //   #1283	-> 155
/*      */     //   #1288	-> 161
/*      */     //   #1289	-> 162
/*      */     //   #161	-> 167
/*      */     //   #163	-> 171
/*      */     //   #161	-> 174
/*      */     //   #163	-> 180
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   91	46	15	$i$a$-fastFilter-AnnotatedString$getStringAnnotations$1	I
/*      */     //   88	49	14	it	Landroidx/compose/ui/text/AnnotatedString$Range;
/*      */     //   81	73	13	$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv	I
/*      */     //   78	76	12	it$iv	Ljava/lang/Object;
/*      */     //   74	81	11	item$iv$iv	Ljava/lang/Object;
/*      */     //   47	114	9	index$iv$iv	I
/*      */     //   43	119	8	$i$f$fastForEach	I
/*      */     //   40	122	7	$this$fastForEach$iv$iv	Ljava/util/List;
/*      */     //   19	148	5	$i$f$fastFilter	I
/*      */     //   36	131	6	target$iv	Ljava/util/ArrayList;
/*      */     //   16	151	4	$this$fastFilter$iv	Ljava/util/List;
/*      */     //   0	181	0	this	Landroidx/compose/ui/text/AnnotatedString;
/*      */     //   0	181	1	tag	Ljava/lang/String;
/*      */     //   0	181	2	start	I
/*      */     //   0	181	3	end	I
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean hasStringAnnotations(@NotNull String tag, int start, int end) {
/*      */     int index$iv$iv, i;
/*  169 */     Intrinsics.checkNotNullParameter(tag, "tag"); if (this.annotations != null) { List<Range<? extends Object>> $this$fastAny$iv = this.annotations; int $i$f$fastAny = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1291 */       List<Range<? extends Object>> $this$fastForEach$iv$iv = $this$fastAny$iv; int $i$f$fastForEach = 0;
/*      */       
/* 1293 */       index$iv$iv = 0; i = $this$fastForEach$iv$iv.size(); } else { return false; }  if (index$iv$iv < i);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final List<Range<String>> getStringAnnotations(int start, int end) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield annotations : Ljava/util/List;
/*      */     //   4: dup
/*      */     //   5: ifnull -> 149
/*      */     //   8: astore_3
/*      */     //   9: iconst_0
/*      */     //   10: istore #4
/*      */     //   12: nop
/*      */     //   13: new java/util/ArrayList
/*      */     //   16: dup
/*      */     //   17: aload_3
/*      */     //   18: invokeinterface size : ()I
/*      */     //   23: invokespecial <init> : (I)V
/*      */     //   26: astore #5
/*      */     //   28: aload_3
/*      */     //   29: astore #6
/*      */     //   31: iconst_0
/*      */     //   32: istore #7
/*      */     //   34: nop
/*      */     //   35: iconst_0
/*      */     //   36: istore #8
/*      */     //   38: aload #6
/*      */     //   40: invokeinterface size : ()I
/*      */     //   45: istore #9
/*      */     //   47: iload #8
/*      */     //   49: iload #9
/*      */     //   51: if_icmpge -> 140
/*      */     //   54: aload #6
/*      */     //   56: iload #8
/*      */     //   58: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   63: astore #10
/*      */     //   65: aload #10
/*      */     //   67: astore #11
/*      */     //   69: iconst_0
/*      */     //   70: istore #12
/*      */     //   72: aload #11
/*      */     //   74: checkcast androidx/compose/ui/text/AnnotatedString$Range
/*      */     //   77: astore #13
/*      */     //   79: iconst_0
/*      */     //   80: istore #14
/*      */     //   82: aload #13
/*      */     //   84: invokevirtual getItem : ()Ljava/lang/Object;
/*      */     //   87: instanceof java/lang/String
/*      */     //   90: ifeq -> 115
/*      */     //   93: iload_1
/*      */     //   94: iload_2
/*      */     //   95: aload #13
/*      */     //   97: invokevirtual getStart : ()I
/*      */     //   100: aload #13
/*      */     //   102: invokevirtual getEnd : ()I
/*      */     //   105: invokestatic intersect : (IIII)Z
/*      */     //   108: ifeq -> 115
/*      */     //   111: iconst_1
/*      */     //   112: goto -> 116
/*      */     //   115: iconst_0
/*      */     //   116: ifeq -> 132
/*      */     //   119: aload #5
/*      */     //   121: checkcast java/util/Collection
/*      */     //   124: aload #11
/*      */     //   126: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   131: pop
/*      */     //   132: nop
/*      */     //   133: nop
/*      */     //   134: iinc #8, 1
/*      */     //   137: goto -> 47
/*      */     //   140: nop
/*      */     //   141: aload #5
/*      */     //   143: checkcast java/util/List
/*      */     //   146: goto -> 153
/*      */     //   149: pop
/*      */     //   150: invokestatic emptyList : ()Ljava/util/List;
/*      */     //   153: dup
/*      */     //   154: ldc 'null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>'
/*      */     //   156: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   159: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #184	-> 0
/*      */     //   #1299	-> 12
/*      */     //   #1300	-> 13
/*      */     //   #1301	-> 28
/*      */     //   #1302	-> 34
/*      */     //   #1303	-> 35
/*      */     //   #1304	-> 54
/*      */     //   #1305	-> 65
/*      */     //   #1306	-> 72
/*      */     //   #185	-> 82
/*      */     //   #1306	-> 116
/*      */     //   #1307	-> 132
/*      */     //   #1305	-> 133
/*      */     //   #1303	-> 134
/*      */     //   #1308	-> 140
/*      */     //   #1309	-> 141
/*      */     //   #184	-> 146
/*      */     //   #186	-> 150
/*      */     //   #184	-> 153
/*      */     //   #186	-> 159
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   82	34	14	$i$a$-fastFilter-AnnotatedString$getStringAnnotations$2	I
/*      */     //   79	37	13	it	Landroidx/compose/ui/text/AnnotatedString$Range;
/*      */     //   72	61	12	$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv	I
/*      */     //   69	64	11	it$iv	Ljava/lang/Object;
/*      */     //   65	69	10	item$iv$iv	Ljava/lang/Object;
/*      */     //   38	102	8	index$iv$iv	I
/*      */     //   34	107	7	$i$f$fastForEach	I
/*      */     //   31	110	6	$this$fastForEach$iv$iv	Ljava/util/List;
/*      */     //   12	134	4	$i$f$fastFilter	I
/*      */     //   28	118	5	target$iv	Ljava/util/ArrayList;
/*      */     //   9	137	3	$this$fastFilter$iv	Ljava/util/List;
/*      */     //   0	160	0	this	Landroidx/compose/ui/text/AnnotatedString;
/*      */     //   0	160	1	start	I
/*      */     //   0	160	2	end	I
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final List<Range<TtsAnnotation>> getTtsAnnotations(int start, int end) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield annotations : Ljava/util/List;
/*      */     //   4: dup
/*      */     //   5: ifnull -> 149
/*      */     //   8: astore_3
/*      */     //   9: iconst_0
/*      */     //   10: istore #4
/*      */     //   12: nop
/*      */     //   13: new java/util/ArrayList
/*      */     //   16: dup
/*      */     //   17: aload_3
/*      */     //   18: invokeinterface size : ()I
/*      */     //   23: invokespecial <init> : (I)V
/*      */     //   26: astore #5
/*      */     //   28: aload_3
/*      */     //   29: astore #6
/*      */     //   31: iconst_0
/*      */     //   32: istore #7
/*      */     //   34: nop
/*      */     //   35: iconst_0
/*      */     //   36: istore #8
/*      */     //   38: aload #6
/*      */     //   40: invokeinterface size : ()I
/*      */     //   45: istore #9
/*      */     //   47: iload #8
/*      */     //   49: iload #9
/*      */     //   51: if_icmpge -> 140
/*      */     //   54: aload #6
/*      */     //   56: iload #8
/*      */     //   58: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   63: astore #10
/*      */     //   65: aload #10
/*      */     //   67: astore #11
/*      */     //   69: iconst_0
/*      */     //   70: istore #12
/*      */     //   72: aload #11
/*      */     //   74: checkcast androidx/compose/ui/text/AnnotatedString$Range
/*      */     //   77: astore #13
/*      */     //   79: iconst_0
/*      */     //   80: istore #14
/*      */     //   82: aload #13
/*      */     //   84: invokevirtual getItem : ()Ljava/lang/Object;
/*      */     //   87: instanceof androidx/compose/ui/text/TtsAnnotation
/*      */     //   90: ifeq -> 115
/*      */     //   93: iload_1
/*      */     //   94: iload_2
/*      */     //   95: aload #13
/*      */     //   97: invokevirtual getStart : ()I
/*      */     //   100: aload #13
/*      */     //   102: invokevirtual getEnd : ()I
/*      */     //   105: invokestatic intersect : (IIII)Z
/*      */     //   108: ifeq -> 115
/*      */     //   111: iconst_1
/*      */     //   112: goto -> 116
/*      */     //   115: iconst_0
/*      */     //   116: ifeq -> 132
/*      */     //   119: aload #5
/*      */     //   121: checkcast java/util/Collection
/*      */     //   124: aload #11
/*      */     //   126: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   131: pop
/*      */     //   132: nop
/*      */     //   133: nop
/*      */     //   134: iinc #8, 1
/*      */     //   137: goto -> 47
/*      */     //   140: nop
/*      */     //   141: aload #5
/*      */     //   143: checkcast java/util/List
/*      */     //   146: goto -> 153
/*      */     //   149: pop
/*      */     //   150: invokestatic emptyList : ()Ljava/util/List;
/*      */     //   153: dup
/*      */     //   154: ldc_w 'null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>'
/*      */     //   157: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   160: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #199	-> 0
/*      */     //   #1310	-> 12
/*      */     //   #1311	-> 13
/*      */     //   #1312	-> 28
/*      */     //   #1313	-> 34
/*      */     //   #1314	-> 35
/*      */     //   #1315	-> 54
/*      */     //   #1316	-> 65
/*      */     //   #1317	-> 72
/*      */     //   #200	-> 82
/*      */     //   #1317	-> 116
/*      */     //   #1318	-> 132
/*      */     //   #1316	-> 133
/*      */     //   #1314	-> 134
/*      */     //   #1319	-> 140
/*      */     //   #1320	-> 141
/*      */     //   #199	-> 146
/*      */     //   #201	-> 150
/*      */     //   #199	-> 153
/*      */     //   #201	-> 160
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   82	34	14	$i$a$-fastFilter-AnnotatedString$getTtsAnnotations$1	I
/*      */     //   79	37	13	it	Landroidx/compose/ui/text/AnnotatedString$Range;
/*      */     //   72	61	12	$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv	I
/*      */     //   69	64	11	it$iv	Ljava/lang/Object;
/*      */     //   65	69	10	item$iv$iv	Ljava/lang/Object;
/*      */     //   38	102	8	index$iv$iv	I
/*      */     //   34	107	7	$i$f$fastForEach	I
/*      */     //   31	110	6	$this$fastForEach$iv$iv	Ljava/util/List;
/*      */     //   12	134	4	$i$f$fastFilter	I
/*      */     //   28	118	5	target$iv	Ljava/util/ArrayList;
/*      */     //   9	137	3	$this$fastFilter$iv	Ljava/util/List;
/*      */     //   0	161	0	this	Landroidx/compose/ui/text/AnnotatedString;
/*      */     //   0	161	1	start	I
/*      */     //   0	161	2	end	I
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated(message = "Use LinkAnnotation API instead", replaceWith = @ReplaceWith(expression = "getLinkAnnotations(start, end)", imports = {}))
/*      */   @ExperimentalTextApi
/*      */   @NotNull
/*      */   public final List<Range<UrlAnnotation>> getUrlAnnotations(int start, int end) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield annotations : Ljava/util/List;
/*      */     //   4: dup
/*      */     //   5: ifnull -> 149
/*      */     //   8: astore_3
/*      */     //   9: iconst_0
/*      */     //   10: istore #4
/*      */     //   12: nop
/*      */     //   13: new java/util/ArrayList
/*      */     //   16: dup
/*      */     //   17: aload_3
/*      */     //   18: invokeinterface size : ()I
/*      */     //   23: invokespecial <init> : (I)V
/*      */     //   26: astore #5
/*      */     //   28: aload_3
/*      */     //   29: astore #6
/*      */     //   31: iconst_0
/*      */     //   32: istore #7
/*      */     //   34: nop
/*      */     //   35: iconst_0
/*      */     //   36: istore #8
/*      */     //   38: aload #6
/*      */     //   40: invokeinterface size : ()I
/*      */     //   45: istore #9
/*      */     //   47: iload #8
/*      */     //   49: iload #9
/*      */     //   51: if_icmpge -> 140
/*      */     //   54: aload #6
/*      */     //   56: iload #8
/*      */     //   58: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   63: astore #10
/*      */     //   65: aload #10
/*      */     //   67: astore #11
/*      */     //   69: iconst_0
/*      */     //   70: istore #12
/*      */     //   72: aload #11
/*      */     //   74: checkcast androidx/compose/ui/text/AnnotatedString$Range
/*      */     //   77: astore #13
/*      */     //   79: iconst_0
/*      */     //   80: istore #14
/*      */     //   82: aload #13
/*      */     //   84: invokevirtual getItem : ()Ljava/lang/Object;
/*      */     //   87: instanceof androidx/compose/ui/text/UrlAnnotation
/*      */     //   90: ifeq -> 115
/*      */     //   93: iload_1
/*      */     //   94: iload_2
/*      */     //   95: aload #13
/*      */     //   97: invokevirtual getStart : ()I
/*      */     //   100: aload #13
/*      */     //   102: invokevirtual getEnd : ()I
/*      */     //   105: invokestatic intersect : (IIII)Z
/*      */     //   108: ifeq -> 115
/*      */     //   111: iconst_1
/*      */     //   112: goto -> 116
/*      */     //   115: iconst_0
/*      */     //   116: ifeq -> 132
/*      */     //   119: aload #5
/*      */     //   121: checkcast java/util/Collection
/*      */     //   124: aload #11
/*      */     //   126: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   131: pop
/*      */     //   132: nop
/*      */     //   133: nop
/*      */     //   134: iinc #8, 1
/*      */     //   137: goto -> 47
/*      */     //   140: nop
/*      */     //   141: aload #5
/*      */     //   143: checkcast java/util/List
/*      */     //   146: goto -> 153
/*      */     //   149: pop
/*      */     //   150: invokestatic emptyList : ()Ljava/util/List;
/*      */     //   153: dup
/*      */     //   154: ldc_w 'null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>'
/*      */     //   157: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   160: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #216	-> 0
/*      */     //   #1321	-> 12
/*      */     //   #1322	-> 13
/*      */     //   #1323	-> 28
/*      */     //   #1324	-> 34
/*      */     //   #1325	-> 35
/*      */     //   #1326	-> 54
/*      */     //   #1327	-> 65
/*      */     //   #1328	-> 72
/*      */     //   #217	-> 82
/*      */     //   #1328	-> 116
/*      */     //   #1329	-> 132
/*      */     //   #1327	-> 133
/*      */     //   #1325	-> 134
/*      */     //   #1330	-> 140
/*      */     //   #1331	-> 141
/*      */     //   #216	-> 146
/*      */     //   #218	-> 150
/*      */     //   #216	-> 153
/*      */     //   #218	-> 160
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   82	34	14	$i$a$-fastFilter-AnnotatedString$getUrlAnnotations$1	I
/*      */     //   79	37	13	it	Landroidx/compose/ui/text/AnnotatedString$Range;
/*      */     //   72	61	12	$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv	I
/*      */     //   69	64	11	it$iv	Ljava/lang/Object;
/*      */     //   65	69	10	item$iv$iv	Ljava/lang/Object;
/*      */     //   38	102	8	index$iv$iv	I
/*      */     //   34	107	7	$i$f$fastForEach	I
/*      */     //   31	110	6	$this$fastForEach$iv$iv	Ljava/util/List;
/*      */     //   12	134	4	$i$f$fastFilter	I
/*      */     //   28	118	5	target$iv	Ljava/util/ArrayList;
/*      */     //   9	137	3	$this$fastFilter$iv	Ljava/util/List;
/*      */     //   0	161	0	this	Landroidx/compose/ui/text/AnnotatedString;
/*      */     //   0	161	1	start	I
/*      */     //   0	161	2	end	I
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final List<Range<LinkAnnotation>> getLinkAnnotations(int start, int end) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield annotations : Ljava/util/List;
/*      */     //   4: dup
/*      */     //   5: ifnull -> 149
/*      */     //   8: astore_3
/*      */     //   9: iconst_0
/*      */     //   10: istore #4
/*      */     //   12: nop
/*      */     //   13: new java/util/ArrayList
/*      */     //   16: dup
/*      */     //   17: aload_3
/*      */     //   18: invokeinterface size : ()I
/*      */     //   23: invokespecial <init> : (I)V
/*      */     //   26: astore #5
/*      */     //   28: aload_3
/*      */     //   29: astore #6
/*      */     //   31: iconst_0
/*      */     //   32: istore #7
/*      */     //   34: nop
/*      */     //   35: iconst_0
/*      */     //   36: istore #8
/*      */     //   38: aload #6
/*      */     //   40: invokeinterface size : ()I
/*      */     //   45: istore #9
/*      */     //   47: iload #8
/*      */     //   49: iload #9
/*      */     //   51: if_icmpge -> 140
/*      */     //   54: aload #6
/*      */     //   56: iload #8
/*      */     //   58: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   63: astore #10
/*      */     //   65: aload #10
/*      */     //   67: astore #11
/*      */     //   69: iconst_0
/*      */     //   70: istore #12
/*      */     //   72: aload #11
/*      */     //   74: checkcast androidx/compose/ui/text/AnnotatedString$Range
/*      */     //   77: astore #13
/*      */     //   79: iconst_0
/*      */     //   80: istore #14
/*      */     //   82: aload #13
/*      */     //   84: invokevirtual getItem : ()Ljava/lang/Object;
/*      */     //   87: instanceof androidx/compose/ui/text/LinkAnnotation
/*      */     //   90: ifeq -> 115
/*      */     //   93: iload_1
/*      */     //   94: iload_2
/*      */     //   95: aload #13
/*      */     //   97: invokevirtual getStart : ()I
/*      */     //   100: aload #13
/*      */     //   102: invokevirtual getEnd : ()I
/*      */     //   105: invokestatic intersect : (IIII)Z
/*      */     //   108: ifeq -> 115
/*      */     //   111: iconst_1
/*      */     //   112: goto -> 116
/*      */     //   115: iconst_0
/*      */     //   116: ifeq -> 132
/*      */     //   119: aload #5
/*      */     //   121: checkcast java/util/Collection
/*      */     //   124: aload #11
/*      */     //   126: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   131: pop
/*      */     //   132: nop
/*      */     //   133: nop
/*      */     //   134: iinc #8, 1
/*      */     //   137: goto -> 47
/*      */     //   140: nop
/*      */     //   141: aload #5
/*      */     //   143: checkcast java/util/List
/*      */     //   146: goto -> 153
/*      */     //   149: pop
/*      */     //   150: invokestatic emptyList : ()Ljava/util/List;
/*      */     //   153: dup
/*      */     //   154: ldc_w 'null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>'
/*      */     //   157: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   160: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #231	-> 0
/*      */     //   #1332	-> 12
/*      */     //   #1333	-> 13
/*      */     //   #1334	-> 28
/*      */     //   #1335	-> 34
/*      */     //   #1336	-> 35
/*      */     //   #1337	-> 54
/*      */     //   #1338	-> 65
/*      */     //   #1339	-> 72
/*      */     //   #232	-> 82
/*      */     //   #1339	-> 116
/*      */     //   #1340	-> 132
/*      */     //   #1338	-> 133
/*      */     //   #1336	-> 134
/*      */     //   #1341	-> 140
/*      */     //   #1342	-> 141
/*      */     //   #231	-> 146
/*      */     //   #233	-> 150
/*      */     //   #231	-> 153
/*      */     //   #233	-> 160
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   82	34	14	$i$a$-fastFilter-AnnotatedString$getLinkAnnotations$1	I
/*      */     //   79	37	13	it	Landroidx/compose/ui/text/AnnotatedString$Range;
/*      */     //   72	61	12	$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv	I
/*      */     //   69	64	11	it$iv	Ljava/lang/Object;
/*      */     //   65	69	10	item$iv$iv	Ljava/lang/Object;
/*      */     //   38	102	8	index$iv$iv	I
/*      */     //   34	107	7	$i$f$fastForEach	I
/*      */     //   31	110	6	$this$fastForEach$iv$iv	Ljava/util/List;
/*      */     //   12	134	4	$i$f$fastFilter	I
/*      */     //   28	118	5	target$iv	Ljava/util/ArrayList;
/*      */     //   9	137	3	$this$fastFilter$iv	Ljava/util/List;
/*      */     //   0	161	0	this	Landroidx/compose/ui/text/AnnotatedString;
/*      */     //   0	161	1	start	I
/*      */     //   0	161	2	end	I
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean hasLinkAnnotations(int start, int end) {
/*      */     int index$iv$iv;
/*      */     int i;
/*      */     if (this.annotations != null)
/*      */     { List<Range<? extends Object>> $this$fastAny$iv = this.annotations;
/*      */       int $i$f$fastAny = 0;
/* 1344 */       List<Range<? extends Object>> $this$fastForEach$iv$iv = $this$fastAny$iv; int $i$f$fastForEach = 0;
/*      */       
/* 1346 */       index$iv$iv = 0; i = $this$fastForEach$iv$iv.size(); } else { return false; }  if (index$iv$iv < i);
/*      */   }
/*      */   
/*      */   public boolean equals(@Nullable Object other) {
/*      */     if (this == other)
/*      */       return true; 
/*      */     if (!(other instanceof AnnotatedString))
/*      */       return false; 
/*      */     if (!Intrinsics.areEqual(this.text, ((AnnotatedString)other).text))
/*      */       return false; 
/*      */     if (!Intrinsics.areEqual(this.spanStylesOrNull, ((AnnotatedString)other).spanStylesOrNull))
/*      */       return false; 
/*      */     if (!Intrinsics.areEqual(this.paragraphStylesOrNull, ((AnnotatedString)other).paragraphStylesOrNull))
/*      */       return false; 
/*      */     if (!Intrinsics.areEqual(this.annotations, ((AnnotatedString)other).annotations))
/*      */       return false; 
/*      */     return true;
/*      */   }
/*      */   
/*      */   public int hashCode() {
/*      */     int result = this.text.hashCode();
/*      */     result = 31 * result + ((this.spanStylesOrNull != null) ? this.spanStylesOrNull.hashCode() : 0);
/*      */     result = 31 * result + ((this.paragraphStylesOrNull != null) ? this.paragraphStylesOrNull.hashCode() : 0);
/*      */     result = 31 * result + ((this.annotations != null) ? this.annotations.hashCode() : 0);
/*      */     return result;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public String toString() {
/*      */     return this.text;
/*      */   }
/*      */   
/*      */   public final boolean hasEqualAnnotations(@NotNull AnnotatedString other) {
/*      */     Intrinsics.checkNotNullParameter(other, "other");
/*      */     return Intrinsics.areEqual(this.annotations, other.annotations);
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\020\n\002\020\013\n\002\b\004\b\b\030\000*\004\b\000\020\0012\0020\002B\037\b\026\022\006\020\003\032\0028\000\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\007B%\022\006\020\003\032\0028\000\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\b\032\0020\t¢\006\002\020\nJ\016\020\023\032\0028\000HÆ\003¢\006\002\020\016J\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\005HÆ\003J\t\020\026\032\0020\tHÆ\003J<\020\027\032\b\022\004\022\0028\0000\0002\b\b\002\020\003\032\0028\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\b\032\0020\tHÆ\001¢\006\002\020\030J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\002HÖ\003J\t\020\034\032\0020\005HÖ\001J\t\020\035\032\0020\tHÖ\001R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\023\020\003\032\0028\000¢\006\n\n\002\020\017\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\fR\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\021\020\022¨\006\036"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "", "item", "start", "", "end", "(Ljava/lang/Object;II)V", "tag", "", "(Ljava/lang/Object;IILjava/lang/String;)V", "getEnd", "()I", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStart", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Range;", "equals", "", "other", "hashCode", "toString", "ui-text"})
/*      */   @Immutable
/*      */   @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1270:1\n1#2:1271\n*E\n"})
/*      */   public static final class Range<T> {
/*      */     private final T item;
/*      */     private final int start;
/*      */     private final int end;
/*      */     @NotNull
/*      */     private final String tag;
/*      */     public static final int $stable;
/*      */     
/*      */     public Range(Object item, int start, int end, @NotNull String tag) {
/*      */       this.item = (T)item;
/*      */       this.start = start;
/*      */       this.end = end;
/*      */       this.tag = tag;
/*      */       if (!((this.start <= this.end) ? 1 : 0)) {
/*      */         int $i$a$-require-AnnotatedString$Range$1 = 0;
/*      */         String str = "Reversed range is not supported";
/*      */         throw new IllegalArgumentException(str.toString());
/*      */       } 
/*      */     }
/*      */     
/*      */     public final T getItem() {
/*      */       return this.item;
/*      */     }
/*      */     
/*      */     public final int getStart() {
/*      */       return this.start;
/*      */     }
/*      */     
/*      */     public final int getEnd() {
/*      */       return this.end;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final String getTag() {
/*      */       return this.tag;
/*      */     }
/*      */     
/*      */     public Range(Object item, int start, int end) {
/*      */       this((T)item, start, end, "");
/*      */     }
/*      */     
/*      */     public final T component1() {
/*      */       return this.item;
/*      */     }
/*      */     
/*      */     public final int component2() {
/*      */       return this.start;
/*      */     }
/*      */     
/*      */     public final int component3() {
/*      */       return this.end;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final String component4() {
/*      */       return this.tag;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Range<T> copy(Object item, int start, int end, @NotNull String tag) {
/*      */       Intrinsics.checkNotNullParameter(tag, "tag");
/*      */       return new Range((T)item, start, end, tag);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String toString() {
/*      */       return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
/*      */     }
/*      */     
/*      */     public int hashCode() {
/*      */       result = (this.item == null) ? 0 : this.item.hashCode();
/*      */       result = result * 31 + Integer.hashCode(this.start);
/*      */       result = result * 31 + Integer.hashCode(this.end);
/*      */       return result * 31 + this.tag.hashCode();
/*      */     }
/*      */     
/*      */     public boolean equals(@Nullable Object other) {
/*      */       if (this == other)
/*      */         return true; 
/*      */       if (!(other instanceof Range))
/*      */         return false; 
/*      */       Range range = (Range)other;
/*      */       return !Intrinsics.areEqual(this.item, range.item) ? false : ((this.start != range.start) ? false : ((this.end != range.end) ? false : (!!Intrinsics.areEqual(this.tag, range.tag))));
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020!\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\f\n\002\020\r\n\002\b\005\n\002\030\002\n\002\b\007\b\007\030\0002\0060\001j\002`\002:\001;B\017\b\026\022\006\020\003\032\0020\004¢\006\002\020\005B\017\b\026\022\006\020\003\032\0020\006¢\006\002\020\007B\017\022\b\b\002\020\b\032\0020\t¢\006\002\020\nJ\036\020\031\032\0020\0322\006\020\033\032\0020\0342\006\020\035\032\0020\t2\006\020\036\032\0020\tJ\036\020\031\032\0020\0322\006\020\037\032\0020 2\006\020\035\032\0020\t2\006\020\036\032\0020\tJ&\020!\032\0020\0322\006\020\"\032\0020\0042\006\020#\032\0020\0042\006\020\035\032\0020\t2\006\020\036\032\0020\tJ\036\020$\032\0020\0322\006\020%\032\0020\0232\006\020\035\032\0020\t2\006\020\036\032\0020\tJ\036\020$\032\0020\0322\006\020%\032\0020\0252\006\020\035\032\0020\t2\006\020\036\032\0020\tJ \020&\032\0020\0322\006\020'\032\0020(2\006\020\035\032\0020\t2\006\020\036\032\0020\tH\007J \020)\032\0020\0322\006\020*\032\0020+2\006\020\035\032\0020\t2\006\020\036\032\0020\tH\007J\016\020,\032\0020\0322\006\020\003\032\0020\006J\036\020,\032\0020\0322\006\020\003\032\0020\0062\006\020\035\032\0020\t2\006\020\036\032\0020\tJ\020\020,\032\0020\0002\006\020-\032\0020.H\026J\022\020,\032\0020\0002\b\020\003\032\004\030\0010/H\026J\"\020,\032\0020\0002\b\020\003\032\004\030\0010/2\006\020\035\032\0020\t2\006\020\036\032\0020\tH\026J\016\020,\032\0020\0322\006\020\003\032\0020\004J\025\0200\032\0020\0322\006\020-\032\0020.H\007¢\006\002\b,J\006\0201\032\0020\032J\016\0201\032\0020\0322\006\0202\032\0020\tJ\016\0203\032\0020\t2\006\0204\032\00205J\026\0206\032\0020\t2\006\020\"\032\0020\0042\006\020#\032\0020\004J\016\0207\032\0020\t2\006\020%\032\0020\023J\016\0207\032\0020\t2\006\020%\032\0020\025J\016\0208\032\0020\t2\006\020'\032\0020(J\020\0209\032\0020\t2\006\020*\032\0020+H\007J\006\020:\032\0020\006R\034\020\013\032\020\022\f\022\n\022\006\b\001\022\0020\0160\r0\fX\004¢\006\002\n\000R\021\020\017\032\0020\t8F¢\006\006\032\004\b\020\020\021R\032\020\022\032\016\022\n\022\b\022\004\022\0020\0230\r0\fX\004¢\006\002\n\000R\032\020\024\032\016\022\n\022\b\022\004\022\0020\0250\r0\fX\004¢\006\002\n\000R\034\020\026\032\020\022\f\022\n\022\006\b\001\022\0020\0160\r0\fX\004¢\006\002\n\000R\022\020\003\032\0060\027j\002`\030X\004¢\006\002\n\000¨\006<"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "text", "", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "capacity", "", "(I)V", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "", "length", "getLength", "()I", "paragraphStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "spanStyles", "Landroidx/compose/ui/text/SpanStyle;", "styleStack", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "addLink", "", "clickable", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "start", "end", "url", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "addStringAnnotation", "tag", "annotation", "addStyle", "style", "addTtsAnnotation", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "addUrlAnnotation", "urlAnnotation", "Landroidx/compose/ui/text/UrlAnnotation;", "append", "char", "", "", "deprecated_append_returning_void", "pop", "index", "pushLink", "link", "Landroidx/compose/ui/text/LinkAnnotation;", "pushStringAnnotation", "pushStyle", "pushTtsAnnotation", "pushUrlAnnotation", "toAnnotatedString", "MutableRange", "ui-text"})
/*      */   @StabilityInferred(parameters = 0)
/*      */   @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1270:1\n33#2,6:1271\n33#2,6:1277\n33#2,6:1283\n33#2,6:1289\n33#2,6:1295\n33#2,6:1301\n151#2,3:1308\n33#2,4:1311\n154#2,2:1315\n38#2:1317\n156#2:1318\n151#2,3:1319\n33#2,4:1322\n154#2,2:1326\n38#2:1328\n156#2:1329\n151#2,3:1330\n33#2,4:1333\n154#2,2:1337\n38#2:1339\n156#2:1340\n1#3:1307\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n436#1:1271,6\n439#1:1277,6\n443#1:1283,6\n463#1:1289,6\n466#1:1295,6\n470#1:1301,6\n742#1:1308,3\n742#1:1311,4\n742#1:1315,2\n742#1:1317\n742#1:1318\n745#1:1319,3\n745#1:1322,4\n745#1:1326,2\n745#1:1328\n745#1:1329\n748#1:1330,3\n748#1:1333,4\n748#1:1337,2\n748#1:1339\n748#1:1340\n*E\n"})
/*      */   public static final class Builder implements Appendable {
/*      */     @NotNull
/*      */     private final StringBuilder text;
/*      */     @NotNull
/*      */     private final List<MutableRange<SpanStyle>> spanStyles;
/*      */     @NotNull
/*      */     private final List<MutableRange<ParagraphStyle>> paragraphStyles;
/*      */     @NotNull
/*      */     private final List<MutableRange<? extends Object>> annotations;
/*      */     @NotNull
/*      */     private final List<MutableRange<? extends Object>> styleStack;
/*      */     public static final int $stable = 8;
/*      */     
/*      */     public Builder(int capacity) {
/*      */       this.text = new StringBuilder(capacity);
/*      */       this.spanStyles = new ArrayList<>();
/*      */       this.paragraphStyles = new ArrayList<>();
/*      */       this.annotations = new ArrayList<>();
/*      */       this.styleStack = new ArrayList<>();
/*      */     }
/*      */     
/*      */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\022\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\b\b\030\000*\004\b\000\020\0012\0020\002B)\022\006\020\003\032\0028\000\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\005\022\b\b\002\020\007\032\0020\b¢\006\002\020\tJ\016\020\024\032\0028\000HÆ\003¢\006\002\020\017J\t\020\025\032\0020\005HÆ\003J\t\020\026\032\0020\005HÆ\003J\t\020\027\032\0020\bHÆ\003J<\020\030\032\b\022\004\022\0028\0000\0002\b\b\002\020\003\032\0028\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\bHÆ\001¢\006\002\020\031J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\002HÖ\003J\t\020\035\032\0020\005HÖ\001J\026\020\036\032\b\022\004\022\0028\0000\0372\b\b\002\020 \032\0020\005J\t\020!\032\0020\bHÖ\001R\032\020\006\032\0020\005X\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\rR\023\020\003\032\0028\000¢\006\n\n\002\020\020\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\021\020\013R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\022\020\023¨\006\""}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "T", "", "item", "start", "", "end", "tag", "", "(Ljava/lang/Object;IILjava/lang/String;)V", "getEnd", "()I", "setEnd", "(I)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStart", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "equals", "", "other", "hashCode", "toRange", "Landroidx/compose/ui/text/AnnotatedString$Range;", "defaultEnd", "toString", "ui-text"})
/*      */     @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1270:1\n1#2:1271\n*E\n"})
/*      */     private static final class MutableRange<T> {
/*      */       private final T item;
/*      */       private final int start;
/*      */       private int end;
/*      */       @NotNull
/*      */       private final String tag;
/*      */       
/*      */       public MutableRange(Object item, int start, int end, @NotNull String tag) {
/*      */         this.item = (T)item;
/*      */         this.start = start;
/*      */         this.end = end;
/*      */         this.tag = tag;
/*      */       }
/*      */       
/*      */       public final T getItem() {
/*      */         return this.item;
/*      */       }
/*      */       
/*      */       public final int getStart() {
/*      */         return this.start;
/*      */       }
/*      */       
/*      */       public final int getEnd() {
/*      */         return this.end;
/*      */       }
/*      */       
/*      */       public final void setEnd(int <set-?>) {
/*      */         this.end = <set-?>;
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       public final String getTag() {
/*      */         return this.tag;
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       public final AnnotatedString.Range<T> toRange(int defaultEnd) {
/*      */         int end = (this.end == Integer.MIN_VALUE) ? defaultEnd : this.end;
/*      */         if (!((end != Integer.MIN_VALUE) ? 1 : 0)) {
/*      */           int $i$a$-check-AnnotatedString$Builder$MutableRange$toRange$1 = 0;
/*      */           String str = "Item.end should be set first";
/*      */           throw new IllegalStateException(str.toString());
/*      */         } 
/*      */         return new AnnotatedString.Range<>(this.item, this.start, end, this.tag);
/*      */       }
/*      */       
/*      */       public final T component1() {
/*      */         return this.item;
/*      */       }
/*      */       
/*      */       public final int component2() {
/*      */         return this.start;
/*      */       }
/*      */       
/*      */       public final int component3() {
/*      */         return this.end;
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       public final String component4() {
/*      */         return this.tag;
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       public final MutableRange<T> copy(Object item, int start, int end, @NotNull String tag) {
/*      */         Intrinsics.checkNotNullParameter(tag, "tag");
/*      */         return new MutableRange((T)item, start, end, tag);
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       public String toString() {
/*      */         return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
/*      */       }
/*      */       
/*      */       public int hashCode() {
/*      */         result = (this.item == null) ? 0 : this.item.hashCode();
/*      */         result = result * 31 + Integer.hashCode(this.start);
/*      */         result = result * 31 + Integer.hashCode(this.end);
/*      */         return result * 31 + this.tag.hashCode();
/*      */       }
/*      */       
/*      */       public boolean equals(@Nullable Object other) {
/*      */         if (this == other)
/*      */           return true; 
/*      */         if (!(other instanceof MutableRange))
/*      */           return false; 
/*      */         MutableRange mutableRange = (MutableRange)other;
/*      */         return !Intrinsics.areEqual(this.item, mutableRange.item) ? false : ((this.start != mutableRange.start) ? false : ((this.end != mutableRange.end) ? false : (!!Intrinsics.areEqual(this.tag, mutableRange.tag))));
/*      */       }
/*      */     }
/*      */     
/*      */     public Builder(@NotNull String text) {
/*      */       this(0, 1, null);
/*      */       append(text);
/*      */     }
/*      */     
/*      */     public Builder(@NotNull AnnotatedString text) {
/*      */       this(0, 1, null);
/*      */       append(text);
/*      */     }
/*      */     
/*      */     public final int getLength() {
/*      */       return this.text.length();
/*      */     }
/*      */     
/*      */     public final void append(@NotNull String text) {
/*      */       Intrinsics.checkNotNullParameter(text, "text");
/*      */       this.text.append(text);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public Builder append(@Nullable CharSequence text) {
/*      */       if (text instanceof AnnotatedString) {
/*      */         append((AnnotatedString)text);
/*      */       } else {
/*      */         this.text.append(text);
/*      */       } 
/*      */       return this;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public Builder append(@Nullable CharSequence text, int start, int end) {
/*      */       if (text instanceof AnnotatedString) {
/*      */         append((AnnotatedString)text, start, end);
/*      */       } else {
/*      */         this.text.append(text, start, end);
/*      */       } 
/*      */       return this;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public Builder append(char char) {
/*      */       this.text.append(char);
/*      */       return this;
/*      */     }
/*      */     
/*      */     public final void append(@NotNull AnnotatedString text) {
/*      */       List<AnnotatedString.Range<? extends Object>> $this$fastForEach$iv;
/*      */       int index$iv, i;
/*      */       Intrinsics.checkNotNullParameter(text, "text");
/*      */       int start = this.text.length();
/*      */       this.text.append(text.getText());
/*      */       if (text.getSpanStylesOrNull$ui_text() != null) {
/*      */         List<AnnotatedString.Range<SpanStyle>> list = text.getSpanStylesOrNull$ui_text();
/*      */         int $i$f$fastForEach = 0;
/*      */         index$iv = 0;
/*      */         i = list.size();
/*      */       } else {
/*      */         text.getSpanStylesOrNull$ui_text();
/*      */         if (text.getParagraphStylesOrNull$ui_text() != null) {
/*      */           List<AnnotatedString.Range<ParagraphStyle>> list = text.getParagraphStylesOrNull$ui_text();
/*      */           int $i$f$fastForEach = 0;
/*      */           index$iv = 0;
/*      */           i = list.size();
/*      */         } else {
/*      */           text.getParagraphStylesOrNull$ui_text();
/*      */           if (text.getAnnotations$ui_text() != null) {
/*      */             $this$fastForEach$iv = text.getAnnotations$ui_text();
/*      */             int $i$f$fastForEach = 0;
/*      */             index$iv = 0;
/*      */             i = $this$fastForEach$iv.size();
/*      */           } else {
/*      */             text.getAnnotations$ui_text();
/*      */             return;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       if (index$iv < i) {
/*      */         Object<? extends Object> item$iv = (Object<? extends Object>)$this$fastForEach$iv.get(index$iv);
/*      */         AnnotatedString.Range<SpanStyle> it = (AnnotatedString.Range)item$iv;
/*      */         int $i$a$-fastForEach-AnnotatedString$Builder$append$1 = 0;
/*      */         addStyle(it.getItem(), start + it.getStart(), start + it.getEnd());
/*      */       } 
/*      */     }
/*      */     
/*      */     public final void append(@NotNull AnnotatedString text, int start, int end) {
/*      */       List $this$fastForEach$iv;
/*      */       int index$iv, i;
/*      */       Intrinsics.checkNotNullParameter(text, "text");
/*      */       int insertionStart = this.text.length();
/*      */       this.text.append(text.getText(), start, end);
/*      */       if (AnnotatedStringKt.access$getLocalSpanStyles(text, start, end) != null) {
/*      */         $this$fastForEach$iv = AnnotatedStringKt.access$getLocalSpanStyles(text, start, end);
/*      */         int $i$f$fastForEach = 0;
/*      */         index$iv = 0;
/*      */         i = $this$fastForEach$iv.size();
/*      */       } else {
/*      */         AnnotatedStringKt.access$getLocalSpanStyles(text, start, end);
/*      */         if (AnnotatedStringKt.access$getLocalParagraphStyles(text, start, end) != null) {
/*      */           $this$fastForEach$iv = AnnotatedStringKt.access$getLocalParagraphStyles(text, start, end);
/*      */           int $i$f$fastForEach = 0;
/*      */           index$iv = 0;
/*      */           i = $this$fastForEach$iv.size();
/*      */         } else {
/*      */           AnnotatedStringKt.access$getLocalParagraphStyles(text, start, end);
/*      */           if (AnnotatedStringKt.access$getLocalAnnotations(text, start, end) != null) {
/*      */             $this$fastForEach$iv = AnnotatedStringKt.access$getLocalAnnotations(text, start, end);
/*      */             int $i$f$fastForEach = 0;
/*      */             index$iv = 0;
/*      */             i = $this$fastForEach$iv.size();
/*      */           } else {
/*      */             AnnotatedStringKt.access$getLocalAnnotations(text, start, end);
/*      */             return;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       if (index$iv < i) {
/*      */         Object item$iv = $this$fastForEach$iv.get(index$iv);
/*      */         AnnotatedString.Range<SpanStyle> it = (AnnotatedString.Range)item$iv;
/*      */         int $i$a$-fastForEach-AnnotatedString$Builder$append$4 = 0;
/*      */         addStyle(it.getItem(), insertionStart + it.getStart(), insertionStart + it.getEnd());
/*      */       } 
/*      */     }
/*      */     
/*      */     public final void addStyle(@NotNull SpanStyle style, int start, int end) {
/*      */       Intrinsics.checkNotNullParameter(style, "style");
/*      */       this.spanStyles.add(new MutableRange<>(style, start, end, null, 8, null));
/*      */     }
/*      */     
/*      */     public final void addStyle(@NotNull ParagraphStyle style, int start, int end) {
/*      */       Intrinsics.checkNotNullParameter(style, "style");
/*      */       this.paragraphStyles.add(new MutableRange<>(style, start, end, null, 8, null));
/*      */     }
/*      */     
/*      */     public final void addStringAnnotation(@NotNull String tag, @NotNull String annotation, int start, int end) {
/*      */       Intrinsics.checkNotNullParameter(tag, "tag");
/*      */       Intrinsics.checkNotNullParameter(annotation, "annotation");
/*      */       this.annotations.add(new MutableRange(annotation, start, end, tag));
/*      */     }
/*      */     
/*      */     @ExperimentalTextApi
/*      */     public final void addTtsAnnotation(@NotNull TtsAnnotation ttsAnnotation, int start, int end) {
/*      */       Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
/*      */       this.annotations.add(new MutableRange(ttsAnnotation, start, end, null, 8, null));
/*      */     }
/*      */     
/*      */     @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "addLink(, start, end)", imports = {}))
/*      */     @ExperimentalTextApi
/*      */     public final void addUrlAnnotation(@NotNull UrlAnnotation urlAnnotation, int start, int end) {
/*      */       Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
/*      */       this.annotations.add(new MutableRange(urlAnnotation, start, end, null, 8, null));
/*      */     }
/*      */     
/*      */     public final void addLink(@NotNull LinkAnnotation.Url url, int start, int end) {
/*      */       Intrinsics.checkNotNullParameter(url, "url");
/*      */       this.annotations.add(new MutableRange(url, start, end, null, 8, null));
/*      */     }
/*      */     
/*      */     public final void addLink(@NotNull LinkAnnotation.Clickable clickable, int start, int end) {
/*      */       Intrinsics.checkNotNullParameter(clickable, "clickable");
/*      */       this.annotations.add(new MutableRange(clickable, start, end, null, 8, null));
/*      */     }
/*      */     
/*      */     public final int pushStyle(@NotNull SpanStyle style) {
/*      */       Intrinsics.checkNotNullParameter(style, "style");
/*      */       MutableRange<? extends Object> mutableRange1 = new MutableRange(style, this.text.length(), 0, null, 12, null), it = mutableRange1;
/*      */       int $i$a$-also-AnnotatedString$Builder$pushStyle$1 = 0;
/*      */       this.styleStack.add(it);
/*      */       this.spanStyles.add(it);
/*      */       return this.styleStack.size() - 1;
/*      */     }
/*      */     
/*      */     public final int pushStyle(@NotNull ParagraphStyle style) {
/*      */       Intrinsics.checkNotNullParameter(style, "style");
/*      */       MutableRange<? extends Object> mutableRange1 = new MutableRange(style, this.text.length(), 0, null, 12, null), it = mutableRange1;
/*      */       int $i$a$-also-AnnotatedString$Builder$pushStyle$2 = 0;
/*      */       this.styleStack.add(it);
/*      */       this.paragraphStyles.add(it);
/*      */       return this.styleStack.size() - 1;
/*      */     }
/*      */     
/*      */     public final int pushStringAnnotation(@NotNull String tag, @NotNull String annotation) {
/*      */       Intrinsics.checkNotNullParameter(tag, "tag");
/*      */       Intrinsics.checkNotNullParameter(annotation, "annotation");
/*      */       MutableRange<? extends Object> mutableRange1 = new MutableRange(annotation, this.text.length(), 0, tag, 4, null), it = mutableRange1;
/*      */       int $i$a$-also-AnnotatedString$Builder$pushStringAnnotation$1 = 0;
/*      */       this.styleStack.add(it);
/*      */       this.annotations.add(it);
/*      */       return this.styleStack.size() - 1;
/*      */     }
/*      */     
/*      */     public final int pushTtsAnnotation(@NotNull TtsAnnotation ttsAnnotation) {
/*      */       Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
/*      */       MutableRange<? extends Object> mutableRange1 = new MutableRange(ttsAnnotation, this.text.length(), 0, null, 12, null), it = mutableRange1;
/*      */       int $i$a$-also-AnnotatedString$Builder$pushTtsAnnotation$1 = 0;
/*      */       this.styleStack.add(it);
/*      */       this.annotations.add(it);
/*      */       return this.styleStack.size() - 1;
/*      */     }
/*      */     
/*      */     @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "pushLink(, start, end)", imports = {}))
/*      */     @ExperimentalTextApi
/*      */     public final int pushUrlAnnotation(@NotNull UrlAnnotation urlAnnotation) {
/*      */       Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
/*      */       MutableRange<? extends Object> mutableRange1 = new MutableRange(urlAnnotation, this.text.length(), 0, null, 12, null), it = mutableRange1;
/*      */       int $i$a$-also-AnnotatedString$Builder$pushUrlAnnotation$1 = 0;
/*      */       this.styleStack.add(it);
/*      */       this.annotations.add(it);
/*      */       return this.styleStack.size() - 1;
/*      */     }
/*      */     
/*      */     public final int pushLink(@NotNull LinkAnnotation link) {
/*      */       Intrinsics.checkNotNullParameter(link, "link");
/*      */       MutableRange<? extends Object> mutableRange1 = new MutableRange(link, this.text.length(), 0, null, 12, null), it = mutableRange1;
/*      */       int $i$a$-also-AnnotatedString$Builder$pushLink$1 = 0;
/*      */       this.styleStack.add(it);
/*      */       this.annotations.add(it);
/*      */       return this.styleStack.size() - 1;
/*      */     }
/*      */     
/*      */     public final void pop() {
/*      */       if (!(!this.styleStack.isEmpty() ? 1 : 0)) {
/*      */         int $i$a$-check-AnnotatedString$Builder$pop$1 = 0;
/*      */         String str = "Nothing to pop.";
/*      */         throw new IllegalStateException(str.toString());
/*      */       } 
/*      */       MutableRange item = this.styleStack.remove(this.styleStack.size() - 1);
/*      */       item.setEnd(this.text.length());
/*      */     }
/*      */     
/*      */     public final void pop(int index) {
/*      */       if (!((index < this.styleStack.size()) ? 1 : 0)) {
/*      */         int $i$a$-check-AnnotatedString$Builder$pop$2 = 0;
/*      */         String str = index + " should be less than " + this.styleStack.size();
/*      */         throw new IllegalStateException(str.toString());
/*      */       } 
/*      */       while (this.styleStack.size() - 1 >= index)
/*      */         pop(); 
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final AnnotatedString toAnnotatedString() {
/*      */       Intrinsics.checkNotNullExpressionValue(this.text.toString(), "toString(...)");
/*      */       List<MutableRange<SpanStyle>> list3 = this.spanStyles;
/*      */       String str1 = this.text.toString();
/*      */       int $i$f$fastMap = 0;
/*      */       ArrayList<MutableRange<ParagraphStyle>> arrayList = new ArrayList(list3.size());
/*      */       List<MutableRange<SpanStyle>> list5 = list3;
/*      */       int $i$f$fastForEach = 0;
/*      */       int index$iv$iv = 0, i = list5.size();
/*      */       if (index$iv$iv < i) {
/*      */         Object<SpanStyle> item$iv$iv = (Object<SpanStyle>)list5.get(index$iv$iv);
/*      */         Object<SpanStyle> it$iv = item$iv$iv;
/*      */         int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/*      */         MutableRange mutableRange = (MutableRange)it$iv;
/*      */         ArrayList<MutableRange<ParagraphStyle>> arrayList4 = arrayList;
/*      */         int $i$a$-fastMap-AnnotatedString$Builder$toAnnotatedString$1 = 0;
/*      */         arrayList4.add(mutableRange.toRange(this.text.length()));
/*      */       } 
/*      */       List<MutableRange<ParagraphStyle>> list2 = arrayList;
/*      */       if (list2.isEmpty()) {
/*      */         str1 = str1;
/*      */         int $i$a$-ifEmpty-AnnotatedString$Builder$toAnnotatedString$2 = 0;
/*      */       } 
/*      */       list2 = this.paragraphStyles;
/*      */       List<MutableRange<ParagraphStyle>> list6 = list2;
/*      */       str1 = str1;
/*      */       $i$f$fastMap = 0;
/*      */       ArrayList<MutableRange<? extends Object>> arrayList1 = new ArrayList(list2.size());
/*      */       List<MutableRange<ParagraphStyle>> list4 = list2;
/*      */       $i$f$fastForEach = 0;
/*      */       index$iv$iv = 0;
/*      */       i = list4.size();
/*      */       if (index$iv$iv < i) {
/*      */         Object<ParagraphStyle> item$iv$iv = (Object<ParagraphStyle>)list4.get(index$iv$iv);
/*      */         Object<ParagraphStyle> it$iv = item$iv$iv;
/*      */         int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/*      */         MutableRange it = (MutableRange)it$iv;
/*      */         ArrayList<MutableRange<? extends Object>> arrayList4 = arrayList1;
/*      */         int $i$a$-fastMap-AnnotatedString$Builder$toAnnotatedString$3 = 0;
/*      */         arrayList4.add(it.toRange(this.text.length()));
/*      */       } 
/*      */       ArrayList<MutableRange<? extends Object>> arrayList2 = arrayList1;
/*      */       List<MutableRange<? extends Object>> list1 = arrayList2;
/*      */       if (list1.isEmpty()) {
/*      */         list6 = list6;
/*      */         str1 = str1;
/*      */         int $i$a$-ifEmpty-AnnotatedString$Builder$toAnnotatedString$4 = 0;
/*      */         arrayList2 = null;
/*      */       } 
/*      */       list1 = this.annotations;
/*      */       List<MutableRange<? extends Object>> list7 = list1;
/*      */       list6 = list6;
/*      */       str1 = str1;
/*      */       $i$f$fastMap = 0;
/*      */       ArrayList<? extends AnnotatedString.Range<? extends Object>> target$iv = new ArrayList(list1.size());
/*      */       List<MutableRange<? extends Object>> $this$fastForEach$iv$iv = list1;
/*      */       $i$f$fastForEach = 0;
/*      */       index$iv$iv = 0;
/*      */       i = $this$fastForEach$iv$iv.size();
/*      */       if (index$iv$iv < i) {
/*      */         Object<? extends Object> item$iv$iv = (Object<? extends Object>)$this$fastForEach$iv$iv.get(index$iv$iv);
/*      */         Object<? extends Object> it$iv = item$iv$iv;
/*      */         int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/*      */         MutableRange it = (MutableRange)it$iv;
/*      */         ArrayList<? extends AnnotatedString.Range<? extends Object>> arrayList4 = target$iv;
/*      */         int $i$a$-fastMap-AnnotatedString$Builder$toAnnotatedString$5 = 0;
/*      */         arrayList4.add(it.toRange(this.text.length()));
/*      */       } 
/*      */       ArrayList<? extends AnnotatedString.Range<? extends Object>> arrayList3 = target$iv;
/*      */       List<? extends AnnotatedString.Range<? extends Object>> $this$fastMap$iv = arrayList3;
/*      */       if ($this$fastMap$iv.isEmpty()) {
/*      */         list7 = list7;
/*      */         list6 = list6;
/*      */         str1 = str1;
/*      */         int $i$a$-ifEmpty-AnnotatedString$Builder$toAnnotatedString$6 = 0;
/*      */         arrayList3 = null;
/*      */       } 
/*      */       List<? extends AnnotatedString.Range<? extends Object>> list8 = $this$fastMap$iv;
/*      */       List<MutableRange<? extends Object>> list9 = list7;
/*      */       List<MutableRange<ParagraphStyle>> list10 = list6;
/*      */       String str2 = str1;
/*      */       return new AnnotatedString(str2, (List)list10, (List)list9, list8);
/*      */     }
/*      */     
/*      */     public Builder() {
/*      */       this(0, 1, null);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\033\020\003\032\f\022\004\022\0020\005\022\002\b\0030\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/AnnotatedString;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text"})
/*      */   public static final class Companion {
/*      */     private Companion() {}
/*      */     
/*      */     @NotNull
/*      */     public final Saver<AnnotatedString, ?> getSaver() {
/*      */       return AnnotatedString.Saver;
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final Companion Companion = new Companion(null);
/*      */   @NotNull
/*      */   private final String text;
/*      */   @Nullable
/*      */   private final List<Range<SpanStyle>> spanStylesOrNull;
/*      */   @Nullable
/*      */   private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
/*      */   @Nullable
/*      */   private final List<Range<? extends Object>> annotations;
/*      */   public static final int $stable;
/*      */   @NotNull
/*      */   private static final Saver<AnnotatedString, ?> Saver = SaversKt.getAnnotatedStringSaver();
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\AnnotatedString.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */