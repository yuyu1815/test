/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.SortedSet;
/*     */ import java.util.TreeSet;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.collections.SetsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\020\016\n\000\032*\020\000\032\0020\0012\022\020\002\032\016\022\b\022\006\022\002\b\0030\004\030\0010\0032\f\020\005\032\b\022\004\022\0020\0070\006H\002\032,\020\b\032\0020\t*\0020\t2\036\020\b\032\032\022\004\022\0020\013\022\004\022\0020\007\022\004\022\0020\007\022\004\022\0020\0130\nH\000¨\006\f"}, d2 = {"collectRangeTransitions", "", "ranges", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "target", "Ljava/util/SortedSet;", "", "transform", "Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "ui-text"})
/*     */ @SourceDebugExtension({"SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,81:1\n151#2,3:82\n33#2,4:85\n154#2,2:89\n38#2:91\n156#2:92\n151#2,3:93\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n151#2,3:104\n33#2,4:107\n154#2,2:111\n38#2:113\n156#2:114\n256#2,3:115\n33#2,4:118\n259#2,2:122\n38#2:124\n261#2:125\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n45#1:82,3\n45#1:85,4\n45#1:89,2\n45#1:91\n45#1:92\n49#1:93,3\n49#1:96,4\n49#1:100,2\n49#1:102\n49#1:103\n52#1:104,3\n52#1:107,4\n52#1:111,2\n52#1:113\n52#1:114\n74#1:115,3\n74#1:118,4\n74#1:122,2\n74#1:124\n74#1:125\n*E\n"})
/*     */ public final class JvmAnnotatedString_jvmKt
/*     */ {
/*     */   @NotNull
/*     */   public static final AnnotatedString transform(@NotNull AnnotatedString $this$transform, @NotNull Function3<? super String, ? super Integer, ? super Integer, String> transform) {
/*     */     ArrayList target$iv;
/*     */     List<AnnotatedString.Range<SpanStyle>> $this$fastForEach$iv$iv;
/*     */     int index$iv$iv, i;
/*  33 */     Intrinsics.checkNotNullParameter($this$transform, "<this>"); Intrinsics.checkNotNullParameter(transform, "transform"); Integer[] arrayOfInteger = new Integer[2]; arrayOfInteger[0] = Integer.valueOf(0); arrayOfInteger[1] = Integer.valueOf($this$transform.getText().length()); TreeSet<Integer> transitions = SetsKt.sortedSetOf((Object[])arrayOfInteger);
/*  34 */     collectRangeTransitions($this$transform.getSpanStylesOrNull$ui_text(), transitions);
/*  35 */     collectRangeTransitions($this$transform.getParagraphStylesOrNull$ui_text(), transitions);
/*  36 */     collectRangeTransitions($this$transform.getAnnotations$ui_text(), transitions);
/*     */     
/*  38 */     Ref.ObjectRef<String> resultStr = new Ref.ObjectRef(); resultStr.element = "";
/*  39 */     Pair[] arrayOfPair = new Pair[1]; arrayOfPair[0] = TuplesKt.to(Integer.valueOf(0), Integer.valueOf(0)); Map<Integer, Integer> offsetMap = MapsKt.mutableMapOf(arrayOfPair);
/*  40 */     CollectionsKt.windowed$default(transitions, 2, 0, false, new JvmAnnotatedString_jvmKt$transform$1(resultStr, transform, $this$transform, offsetMap), 6, null);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  45 */     if ($this$transform.getSpanStylesOrNull$ui_text() != null) { List<AnnotatedString.Range<SpanStyle>> $this$fastMap$iv = $this$transform.getSpanStylesOrNull$ui_text(); int $i$f$fastMap = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  83 */       target$iv = new ArrayList($this$fastMap$iv.size());
/*  84 */       $this$fastForEach$iv$iv = $this$fastMap$iv; int $i$f$fastForEach = 0;
/*     */       
/*  86 */       index$iv$iv = 0; i = $this$fastForEach$iv$iv.size(); } else { $this$transform.getSpanStylesOrNull$ui_text(); List newSpanStyles = null; }  if (index$iv$iv < i) {
/*  87 */       Object<SpanStyle> item$iv$iv = (Object<SpanStyle>)$this$fastForEach$iv$iv.get(index$iv$iv);
/*  88 */       Object<SpanStyle> it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/*  89 */       AnnotatedString.Range range = (AnnotatedString.Range)it$iv; ArrayList arrayList = target$iv; int $i$a$-fastMap-JvmAnnotatedString_jvmKt$transform$newSpanStyles$1 = 0; Intrinsics.checkNotNull(offsetMap.get(Integer.valueOf(range.getStart()))); Intrinsics.checkNotNull(offsetMap.get(Integer.valueOf(range.getEnd()))); arrayList.add(new AnnotatedString.Range(range.getItem(), offsetMap.get(Integer.valueOf(range.getStart())).intValue(), offsetMap.get(Integer.valueOf(range.getEnd())).intValue()));
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\020 \n\002\b\002\020\000\032\004\030\0010\0012\f\020\002\032\b\022\004\022\0020\0010\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "invoke", "(Ljava/util/List;)Ljava/lang/Integer;"})
/*     */   static final class JvmAnnotatedString_jvmKt$transform$1 extends Lambda implements Function1<List<? extends Integer>, Integer> {
/*     */     JvmAnnotatedString_jvmKt$transform$1(Ref.ObjectRef<String> $resultStr, Function3<String, Integer, Integer, String> $transform, AnnotatedString $receiver, Map<Integer, Integer> $offsetMap) {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Integer invoke(@NotNull List<Integer> param1List) {
/*     */       Intrinsics.checkNotNullParameter(param1List, "<name for destructuring parameter 0>");
/*     */       int start = ((Number)param1List.get(0)).intValue(), end = ((Number)param1List.get(1)).intValue();
/*     */       this.$resultStr.element = (String)this.$resultStr.element + (String)this.$transform.invoke(this.$this_transform.getText(), Integer.valueOf(start), Integer.valueOf(end));
/*     */       return this.$offsetMap.put(Integer.valueOf(end), Integer.valueOf(((String)this.$resultStr.element).length()));
/*     */     }
/*     */   }
/*     */   
/*     */   private static final void collectRangeTransitions(List ranges, SortedSet target) {
/*     */     Object accumulator$iv;
/*     */     List $this$fastForEach$iv$iv;
/*     */     int index$iv$iv;
/*     */     int i;
/*     */     if (ranges != null)
/*     */     { List $this$fastFold$iv = ranges;
/*     */       int $i$f$fastFold = 0;
/* 116 */       accumulator$iv = null; accumulator$iv = target;
/* 117 */       $this$fastForEach$iv$iv = $this$fastFold$iv; int $i$f$fastForEach = 0;
/*     */       
/* 119 */       index$iv$iv = 0; i = $this$fastForEach$iv$iv.size(); } else { return; }  if (index$iv$iv < i) {
/* 120 */       Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 121 */       Object e$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastFold$2$iv = 0;
/* 122 */       AnnotatedString.Range range = (AnnotatedString.Range)e$iv; Object object1 = accumulator$iv; int $i$a$-fastFold-JvmAnnotatedString_jvmKt$collectRangeTransitions$1 = 0;
/*     */       Object object2 = object1, object3 = object2;
/*     */       int $i$a$-apply-JvmAnnotatedString_jvmKt$collectRangeTransitions$1$1 = 0;
/*     */       object3.add(Integer.valueOf(range.getStart()));
/*     */       object3.add(Integer.valueOf(range.getEnd()));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\JvmAnnotatedString_jvmKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */