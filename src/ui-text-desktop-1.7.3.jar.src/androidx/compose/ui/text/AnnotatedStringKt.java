/*      */ package androidx.compose.ui.text;
/*      */ 
/*      */ import androidx.compose.ui.text.intl.LocaleList;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import kotlin.Deprecated;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.ReplaceWith;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.functions.Function3;
/*      */ import kotlin.jvm.internal.InlineMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.ranges.RangesKt;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000~\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\005\n\002\020 \n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\032\026\020\002\032\0020\0012\006\020\003\032\0020\0042\006\020\005\032\0020\006\032\"\020\002\032\0020\0012\006\020\003\032\0020\0042\006\020\007\032\0020\b2\n\b\002\020\005\032\004\030\0010\006\032%\020\t\032\0020\0012\027\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016H\bø\001\000\032(\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\0222\006\020\024\032\0020\0222\006\020\025\032\0020\022H\000\032\b\020\026\032\0020\001H\000\032D\020\027\032\020\022\n\022\b\022\004\022\002H\0320\031\030\0010\030\"\004\b\000\020\0322\026\020\033\032\022\022\f\022\n\022\006\b\001\022\002H\0320\031\030\0010\0302\006\020\034\032\0020\0222\006\020\035\032\0020\022H\002\032(\020\036\032\0020\0202\006\020\037\032\0020\0222\006\020 \032\0020\0222\006\020!\032\0020\0222\006\020\"\032\0020\022H\000\032\024\020#\032\0020\001*\0020\0012\b\b\002\020$\032\0020%\032\024\020&\032\0020\001*\0020\0012\b\b\002\020$\032\0020%\032,\020'\032\022\022\f\022\n\022\006\b\001\022\0020(0\031\030\0010\030*\0020\0012\006\020\034\032\0020\0222\006\020\035\032\0020\022H\002\032*\020)\032\020\022\n\022\b\022\004\022\0020\0060\031\030\0010\030*\0020\0012\006\020\034\032\0020\0222\006\020\035\032\0020\022H\002\032*\020*\032\020\022\n\022\b\022\004\022\0020\b0\031\030\0010\030*\0020\0012\006\020\034\032\0020\0222\006\020\035\032\0020\022H\002\032d\020+\032\b\022\004\022\002H\0320\030\"\004\b\000\020\032*\0020\0012\006\020,\032\0020\0062>\b\004\020-\0328\022\023\022\0210\001¢\006\f\b/\022\b\b0\022\004\b\b(1\022\031\022\027\022\004\022\0020\0060\031¢\006\f\b/\022\b\b0\022\004\b\b(\005\022\004\022\002H\0320.H\bø\001\000\032 \0202\032\016\022\n\022\b\022\004\022\0020\0060\0310\030*\0020\0012\006\020,\032\0020\006H\000\032\034\0203\032\0020\001*\0020\0012\006\020\034\032\0020\0222\006\020\035\032\0020\022H\002\032\024\0204\032\0020\001*\0020\0012\b\b\002\020$\032\0020%\032\024\0205\032\0020\001*\0020\0012\b\b\002\020$\032\0020%\032B\0206\032\002H7\"\b\b\000\0207*\0020(*\0020\f2\006\0208\032\002092\031\b\004\020-\032\023\022\004\022\0020\f\022\004\022\002H70\013¢\006\002\b\016H\bø\001\000¢\006\002\020:\032B\0206\032\002H7\"\b\b\000\0207*\0020(*\0020\f2\006\020;\032\0020<2\031\b\004\020-\032\023\022\004\022\0020\f\022\004\022\002H70\013¢\006\002\b\016H\bø\001\000¢\006\002\020=\032J\0206\032\002H7\"\b\b\000\0207*\0020(*\0020\f2\006\020>\032\0020\0042\006\020?\032\0020\0042\031\b\004\020-\032\023\022\004\022\0020\f\022\004\022\002H70\013¢\006\002\b\016H\bø\001\000¢\006\002\020@\032@\020A\032\002H7\"\b\b\000\0207*\0020(*\0020\f2\006\020B\032\0020C2\027\020-\032\023\022\004\022\0020\f\022\004\022\002H70\013¢\006\002\b\016H\bø\001\000¢\006\002\020D\032B\020E\032\002H7\"\b\b\000\0207*\0020(*\0020\f2\006\020F\032\0020\0062\031\b\004\020-\032\023\022\004\022\0020\f\022\004\022\002H70\013¢\006\002\b\016H\bø\001\000¢\006\002\020G\032@\020E\032\002H7\"\b\b\000\0207*\0020(*\0020\f2\006\020F\032\0020\b2\027\020-\032\023\022\004\022\0020\f\022\004\022\002H70\013¢\006\002\b\016H\bø\001\000¢\006\002\020H\"\016\020\000\032\0020\001X\004¢\006\002\n\000\002\007\n\005\b20\001¨\006I"}, d2 = {"EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "AnnotatedString", "text", "", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "buildAnnotatedString", "builder", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "Lkotlin/ExtensionFunctionType;", "contains", "", "baseStart", "", "baseEnd", "targetStart", "targetEnd", "emptyAnnotatedString", "filterRanges", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "ranges", "start", "end", "intersect", "lStart", "lEnd", "rStart", "rEnd", "capitalize", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "decapitalize", "getLocalAnnotations", "", "getLocalParagraphStyles", "getLocalSpanStyles", "mapEachParagraphStyle", "defaultParagraphStyle", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "annotatedString", "normalizedParagraphStyles", "substringWithoutParagraphStyles", "toLowerCase", "toUpperCase", "withAnnotation", "R", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "urlAnnotation", "Landroidx/compose/ui/text/UrlAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/UrlAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tag", "annotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withLink", "link", "Landroidx/compose/ui/text/LinkAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/LinkAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withStyle", "style", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui-text"})
/*      */ @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1270:1\n33#2,6:1271\n235#2,3:1277\n33#2,4:1280\n238#2,2:1284\n38#2:1286\n240#2:1287\n151#2,3:1288\n33#2,4:1291\n154#2,2:1295\n38#2:1297\n156#2:1298\n235#2,3:1299\n33#2,4:1302\n238#2,2:1306\n38#2:1308\n240#2:1309\n151#2,3:1310\n33#2,4:1313\n154#2,2:1317\n38#2:1319\n156#2:1320\n235#2,3:1321\n33#2,4:1324\n238#2,2:1328\n38#2:1330\n240#2:1331\n151#2,3:1332\n33#2,4:1335\n154#2,2:1339\n38#2:1341\n156#2:1342\n151#2,3:1343\n33#2,4:1346\n154#2,2:1350\n38#2:1352\n156#2:1353\n235#2,3:1355\n33#2,4:1358\n238#2,2:1362\n38#2:1364\n240#2:1365\n151#2,3:1366\n33#2,4:1369\n154#2,2:1373\n38#2:1375\n156#2:1376\n1#3:1354\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n789#1:1271,6\n825#1:1277,3\n825#1:1280,4\n825#1:1284,2\n825#1:1286\n825#1:1287\n826#1:1288,3\n826#1:1291,4\n826#1:1295,2\n826#1:1297\n826#1:1298\n852#1:1299,3\n852#1:1302,4\n852#1:1306,2\n852#1:1308\n852#1:1309\n853#1:1310,3\n853#1:1313,4\n853#1:1317,2\n853#1:1319\n853#1:1320\n879#1:1321,3\n879#1:1324,4\n879#1:1328,2\n879#1:1330\n879#1:1331\n880#1:1332,3\n880#1:1335,4\n880#1:1339,2\n880#1:1341\n880#1:1342\n916#1:1343,3\n916#1:1346,4\n916#1:1350,2\n916#1:1352\n916#1:1353\n1192#1:1355,3\n1192#1:1358,4\n1192#1:1362,2\n1192#1:1364\n1192#1:1365\n1192#1:1366,3\n1192#1:1369,4\n1192#1:1373,2\n1192#1:1375\n1192#1:1376\n*E\n"})
/*      */ public final class AnnotatedStringKt
/*      */ {
/*      */   @NotNull
/*      */   public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(@NotNull AnnotatedString $this$normalizedParagraphStyles, @NotNull ParagraphStyle defaultParagraphStyle) {
/*  784 */     Intrinsics.checkNotNullParameter($this$normalizedParagraphStyles, "<this>"); Intrinsics.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle"); int length = $this$normalizedParagraphStyles.getText().length();
/*  785 */     if ($this$normalizedParagraphStyles.getParagraphStylesOrNull$ui_text() == null) $this$normalizedParagraphStyles.getParagraphStylesOrNull$ui_text();  List paragraphStyles = CollectionsKt.emptyList();
/*      */     
/*  787 */     int lastOffset = 0;
/*  788 */     List<AnnotatedString.Range<ParagraphStyle>> result = new ArrayList();
/*  789 */     List $this$fastForEach$iv = paragraphStyles; int $i$f$fastForEach = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1272 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i)
/* 1273 */     { Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 1274 */       AnnotatedString.Range<ParagraphStyle> range = (AnnotatedString.Range)item$iv; int $i$a$-fastForEach-AnnotatedStringKt$normalizedParagraphStyles$1 = 0; ParagraphStyle style = range.component1(); int start = range.component2(), end = range.component3(); }  if (lastOffset != length)
/*      */       result.add(new AnnotatedString.Range<>(defaultParagraphStyle, lastOffset, length));  if (result.isEmpty())
/*      */       result.add(new AnnotatedString.Range<>(defaultParagraphStyle, 0, 0));  return result; } private static final List<AnnotatedString.Range<SpanStyle>> getLocalSpanStyles(AnnotatedString $this$getLocalSpanStyles, int start, int end) { List<AnnotatedString.Range<SpanStyle>> spanStyles; if (start == end)
/*      */       return null;  if ($this$getLocalSpanStyles.getSpanStylesOrNull$ui_text() == null) { $this$getLocalSpanStyles.getSpanStylesOrNull$ui_text(); return null; }  if (start == 0 && end >= $this$getLocalSpanStyles.getText().length())
/* 1278 */       return spanStyles;  List<AnnotatedString.Range<SpanStyle>> $this$fastFilter$iv = spanStyles; int $i$f$fastFilter = 0; ArrayList<Object<SpanStyle>> arrayList2 = new ArrayList($this$fastFilter$iv.size());
/* 1279 */     List<AnnotatedString.Range<SpanStyle>> list1 = $this$fastFilter$iv; int $i$f$fastForEach = 0;
/*      */     
/* 1281 */     int index$iv$iv = 0, i = list1.size(); if (index$iv$iv < i) {
/* 1282 */       Object<SpanStyle> item$iv$iv = (Object<SpanStyle>)list1.get(index$iv$iv);
/* 1283 */       Object<SpanStyle> it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv = 0;
/* 1284 */       AnnotatedString.Range it = (AnnotatedString.Range)it$iv; int $i$a$-fastFilter-AnnotatedStringKt$getLocalSpanStyles$1 = 0; if (intersect(start, end, it.getStart(), it.getEnd())) arrayList2.add(it$iv);
/*      */     
/*      */     } 
/* 1287 */     ArrayList<Object<SpanStyle>> arrayList1 = arrayList2;
/*      */     int $i$f$fastMap = 0;
/* 1289 */     ArrayList<AnnotatedString.Range<SpanStyle>> target$iv = new ArrayList(arrayList1.size());
/* 1290 */     List<Object<SpanStyle>> $this$fastForEach$iv$iv = arrayList1; $i$f$fastForEach = 0;
/*      */     
/* 1292 */     index$iv$iv = 0; i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) {
/* 1293 */       Object<SpanStyle> item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 1294 */       Object<SpanStyle> it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/* 1295 */       AnnotatedString.Range range = (AnnotatedString.Range)it$iv; ArrayList<AnnotatedString.Range<SpanStyle>> arrayList = target$iv; int $i$a$-fastMap-AnnotatedStringKt$getLocalSpanStyles$2 = 0;
/*      */     } 
/*      */     
/* 1298 */     return target$iv; } private static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString $this$getLocalParagraphStyles, int start, int end) { List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles; if (start == end)
/*      */       return null;  if ($this$getLocalParagraphStyles.getParagraphStylesOrNull$ui_text() == null) { $this$getLocalParagraphStyles.getParagraphStylesOrNull$ui_text(); return null; }  if (start == 0 && end >= $this$getLocalParagraphStyles.getText().length())
/* 1300 */       return paragraphStyles;  List<AnnotatedString.Range<ParagraphStyle>> $this$fastFilter$iv = paragraphStyles; int $i$f$fastFilter = 0; ArrayList<Object<ParagraphStyle>> arrayList2 = new ArrayList($this$fastFilter$iv.size());
/* 1301 */     List<AnnotatedString.Range<ParagraphStyle>> list1 = $this$fastFilter$iv; int $i$f$fastForEach = 0;
/*      */     
/* 1303 */     int index$iv$iv = 0, i = list1.size(); if (index$iv$iv < i) {
/* 1304 */       Object<ParagraphStyle> item$iv$iv = (Object<ParagraphStyle>)list1.get(index$iv$iv);
/* 1305 */       Object<ParagraphStyle> it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv = 0;
/* 1306 */       AnnotatedString.Range it = (AnnotatedString.Range)it$iv; int $i$a$-fastFilter-AnnotatedStringKt$getLocalParagraphStyles$1 = 0; if (intersect(start, end, it.getStart(), it.getEnd())) arrayList2.add(it$iv);
/*      */     
/*      */     } 
/* 1309 */     ArrayList<Object<ParagraphStyle>> arrayList1 = arrayList2;
/*      */     int $i$f$fastMap = 0;
/* 1311 */     ArrayList<AnnotatedString.Range<ParagraphStyle>> target$iv = new ArrayList(arrayList1.size());
/* 1312 */     List<Object<ParagraphStyle>> $this$fastForEach$iv$iv = arrayList1; $i$f$fastForEach = 0;
/*      */     
/* 1314 */     index$iv$iv = 0; i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) {
/* 1315 */       Object<ParagraphStyle> item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 1316 */       Object<ParagraphStyle> it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/* 1317 */       AnnotatedString.Range range = (AnnotatedString.Range)it$iv; ArrayList<AnnotatedString.Range<ParagraphStyle>> arrayList = target$iv; int $i$a$-fastMap-AnnotatedStringKt$getLocalParagraphStyles$2 = 0;
/*      */     } 
/*      */     
/* 1320 */     return target$iv; } private static final List<AnnotatedString.Range<? extends Object>> getLocalAnnotations(AnnotatedString $this$getLocalAnnotations, int start, int end) { List<AnnotatedString.Range<? extends Object>> annotations; if (start == end)
/*      */       return null;  if ($this$getLocalAnnotations.getAnnotations$ui_text() == null) { $this$getLocalAnnotations.getAnnotations$ui_text(); return null; }  if (start == 0 && end >= $this$getLocalAnnotations.getText().length())
/* 1322 */       return annotations;  List<AnnotatedString.Range<? extends Object>> $this$fastFilter$iv = annotations; int $i$f$fastFilter = 0; ArrayList<Object<? extends Object>> arrayList2 = new ArrayList($this$fastFilter$iv.size());
/* 1323 */     List<AnnotatedString.Range<? extends Object>> list1 = $this$fastFilter$iv; int $i$f$fastForEach = 0;
/*      */     
/* 1325 */     int index$iv$iv = 0, i = list1.size(); if (index$iv$iv < i) {
/* 1326 */       Object<? extends Object> item$iv$iv = (Object<? extends Object>)list1.get(index$iv$iv);
/* 1327 */       Object<? extends Object> it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv = 0;
/* 1328 */       AnnotatedString.Range it = (AnnotatedString.Range)it$iv; int $i$a$-fastFilter-AnnotatedStringKt$getLocalAnnotations$1 = 0; if (intersect(start, end, it.getStart(), it.getEnd())) arrayList2.add(it$iv);
/*      */     
/*      */     } 
/* 1331 */     ArrayList<Object<? extends Object>> arrayList1 = arrayList2;
/*      */     int $i$f$fastMap = 0;
/* 1333 */     ArrayList<AnnotatedString.Range<? extends Object>> target$iv = new ArrayList(arrayList1.size());
/* 1334 */     List<Object<? extends Object>> $this$fastForEach$iv$iv = arrayList1; $i$f$fastForEach = 0;
/*      */     
/* 1336 */     index$iv$iv = 0; i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) {
/* 1337 */       Object<? extends Object> item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 1338 */       Object<? extends Object> it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/* 1339 */       AnnotatedString.Range<Object> range = (AnnotatedString.Range)it$iv; ArrayList<AnnotatedString.Range<? extends Object>> arrayList = target$iv; int $i$a$-fastMap-AnnotatedStringKt$getLocalAnnotations$2 = 0; String str = range.getTag(); Object object = range.getItem(); int j = RangesKt.coerceIn(range.getStart(), start, end) - start;
/*      */       int k = RangesKt.coerceIn(range.getEnd(), start, end) - start;
/*      */     } 
/* 1342 */     return target$iv; } private static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString $this$substringWithoutParagraphStyles, int start, int end) { Intrinsics.checkNotNullExpressionValue($this$substringWithoutParagraphStyles.getText().substring(start, end), "substring(...)"); return new AnnotatedString((start != end) ? $this$substringWithoutParagraphStyles.getText().substring(start, end) : "", getLocalSpanStyles($this$substringWithoutParagraphStyles, start, end), null, null, 12, null); }
/*      */   @NotNull public static final <T> List<T> mapEachParagraphStyle(@NotNull AnnotatedString $this$mapEachParagraphStyle, @NotNull ParagraphStyle defaultParagraphStyle, @NotNull Function2 block) { Intrinsics.checkNotNullParameter($this$mapEachParagraphStyle, "<this>"); Intrinsics.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$mapEachParagraphStyle = 0; List<AnnotatedString.Range<ParagraphStyle>> $this$fastMap$iv = normalizedParagraphStyles($this$mapEachParagraphStyle, defaultParagraphStyle); int $i$f$fastMap = 0;
/* 1344 */     ArrayList<T> target$iv = new ArrayList($this$fastMap$iv.size());
/* 1345 */     List<AnnotatedString.Range<ParagraphStyle>> $this$fastForEach$iv$iv = $this$fastMap$iv; int $i$f$fastForEach = 0;
/*      */     
/* 1347 */     int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) {
/* 1348 */       Object<ParagraphStyle> item$iv$iv = (Object<ParagraphStyle>)$this$fastForEach$iv$iv.get(index$iv$iv);
/* 1349 */       Object<ParagraphStyle> it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/* 1350 */       AnnotatedString.Range range = (AnnotatedString.Range)it$iv; ArrayList<T> arrayList = target$iv; int $i$a$-fastMap-AnnotatedStringKt$mapEachParagraphStyle$1 = 0;
/*      */     } 
/*      */     
/* 1353 */     return target$iv; }
/* 1354 */   @NotNull public static final AnnotatedString toUpperCase(@NotNull AnnotatedString $this$toUpperCase, @NotNull LocaleList localeList) { Intrinsics.checkNotNullParameter($this$toUpperCase, "<this>"); Intrinsics.checkNotNullParameter(localeList, "localeList"); return JvmAnnotatedString_jvmKt.transform($this$toUpperCase, new AnnotatedStringKt$toUpperCase$1(localeList)); } private static final <T> List<AnnotatedString.Range<T>> filterRanges(List<Object> ranges, int start, int end) { List<Object> nonNullRange; if (!((start <= end) ? 1 : 0)) { int $i$a$-require-AnnotatedStringKt$filterRanges$1 = 0; String str = "start (" + start + ") should be less than or equal to end (" + end + ')'; throw new IllegalArgumentException(str.toString()); }
/*      */      if (ranges == null)
/* 1356 */       return null;  List<Object> $this$fastFilter$iv = nonNullRange; int $i$f$fastFilter = 0; ArrayList<Object> arrayList = new ArrayList($this$fastFilter$iv.size());
/* 1357 */     List<Object> list1 = $this$fastFilter$iv; int $i$f$fastForEach = 0;
/*      */     
/* 1359 */     int index$iv$iv = 0, i = list1.size(); if (index$iv$iv < i) {
/* 1360 */       Object item$iv$iv = list1.get(index$iv$iv);
/* 1361 */       Object it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv = 0;
/* 1362 */       AnnotatedString.Range it = (AnnotatedString.Range)it$iv; int $i$a$-fastFilter-AnnotatedStringKt$filterRanges$2 = 0; if (intersect(start, end, it.getStart(), it.getEnd())) arrayList.add(it$iv);
/*      */     
/*      */     } 
/* 1365 */     $this$fastFilter$iv = arrayList;
/*      */     int $i$f$fastMap = 0;
/* 1367 */     ArrayList<AnnotatedString.Range<T>> target$iv = new ArrayList($this$fastFilter$iv.size());
/* 1368 */     List<Object> $this$fastForEach$iv$iv = $this$fastFilter$iv; $i$f$fastForEach = 0;
/*      */     
/* 1370 */     index$iv$iv = 0; i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) {
/* 1371 */       Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 1372 */       Object it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/* 1373 */       AnnotatedString.Range range = (AnnotatedString.Range)it$iv; ArrayList<AnnotatedString.Range<T>> arrayList1 = target$iv; int $i$a$-fastMap-AnnotatedStringKt$filterRanges$3 = 0;
/*      */     } 
/*      */     
/* 1376 */     List<AnnotatedString.Range<T>> $this$fastMap$iv = target$iv;
/*      */     int $i$a$-ifEmpty-AnnotatedStringKt$filterRanges$4 = 0;
/*      */     return $this$fastMap$iv.isEmpty() ? null : $this$fastMap$iv; }
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0042\006\020\005\032\0020\004H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "str", "start", "", "end", "invoke"})
/*      */   static final class AnnotatedStringKt$toUpperCase$1 extends Lambda implements Function3<String, Integer, Integer, String> {
/*      */     AnnotatedStringKt$toUpperCase$1(LocaleList $localeList) {
/*      */       super(3);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final String invoke(@NotNull String str, int start, int end) {
/*      */       Intrinsics.checkNotNullParameter(str, "str");
/*      */       Intrinsics.checkNotNullExpressionValue(str.substring(start, end), "substring(...)");
/*      */       return StringKt.toUpperCase(str.substring(start, end), this.$localeList);
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final AnnotatedString toLowerCase(@NotNull AnnotatedString $this$toLowerCase, @NotNull LocaleList localeList) {
/*      */     Intrinsics.checkNotNullParameter($this$toLowerCase, "<this>");
/*      */     Intrinsics.checkNotNullParameter(localeList, "localeList");
/*      */     return JvmAnnotatedString_jvmKt.transform($this$toLowerCase, new AnnotatedStringKt$toLowerCase$1(localeList));
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0042\006\020\005\032\0020\004H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "str", "start", "", "end", "invoke"})
/*      */   static final class AnnotatedStringKt$toLowerCase$1 extends Lambda implements Function3<String, Integer, Integer, String> {
/*      */     AnnotatedStringKt$toLowerCase$1(LocaleList $localeList) {
/*      */       super(3);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final String invoke(@NotNull String str, int start, int end) {
/*      */       Intrinsics.checkNotNullParameter(str, "str");
/*      */       Intrinsics.checkNotNullExpressionValue(str.substring(start, end), "substring(...)");
/*      */       return StringKt.toLowerCase(str.substring(start, end), this.$localeList);
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final AnnotatedString capitalize(@NotNull AnnotatedString $this$capitalize, @NotNull LocaleList localeList) {
/*      */     Intrinsics.checkNotNullParameter($this$capitalize, "<this>");
/*      */     Intrinsics.checkNotNullParameter(localeList, "localeList");
/*      */     return JvmAnnotatedString_jvmKt.transform($this$capitalize, new AnnotatedStringKt$capitalize$1(localeList));
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0042\006\020\005\032\0020\004H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "str", "start", "", "end", "invoke"})
/*      */   static final class AnnotatedStringKt$capitalize$1 extends Lambda implements Function3<String, Integer, Integer, String> {
/*      */     @NotNull
/*      */     public final String invoke(@NotNull String str, int start, int end) {
/*      */       Intrinsics.checkNotNullParameter(str, "str");
/*      */       Intrinsics.checkNotNullExpressionValue(str.substring(start, end), "substring(...)");
/*      */       Intrinsics.checkNotNullExpressionValue(str.substring(start, end), "substring(...)");
/*      */       return (start == 0) ? StringKt.capitalize(str.substring(start, end), this.$localeList) : str.substring(start, end);
/*      */     }
/*      */     
/*      */     AnnotatedStringKt$capitalize$1(LocaleList $localeList) {
/*      */       super(3);
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final AnnotatedString decapitalize(@NotNull AnnotatedString $this$decapitalize, @NotNull LocaleList localeList) {
/*      */     Intrinsics.checkNotNullParameter($this$decapitalize, "<this>");
/*      */     Intrinsics.checkNotNullParameter(localeList, "localeList");
/*      */     return JvmAnnotatedString_jvmKt.transform($this$decapitalize, new AnnotatedStringKt$decapitalize$1(localeList));
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0042\006\020\005\032\0020\004H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "str", "start", "", "end", "invoke"})
/*      */   static final class AnnotatedStringKt$decapitalize$1 extends Lambda implements Function3<String, Integer, Integer, String> {
/*      */     @NotNull
/*      */     public final String invoke(@NotNull String str, int start, int end) {
/*      */       Intrinsics.checkNotNullParameter(str, "str");
/*      */       Intrinsics.checkNotNullExpressionValue(str.substring(start, end), "substring(...)");
/*      */       Intrinsics.checkNotNullExpressionValue(str.substring(start, end), "substring(...)");
/*      */       return (start == 0) ? StringKt.decapitalize(str.substring(start, end), this.$localeList) : str.substring(start, end);
/*      */     }
/*      */     
/*      */     AnnotatedStringKt$decapitalize$1(LocaleList $localeList) {
/*      */       super(3);
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final <R> R withStyle(@NotNull AnnotatedString.Builder $this$withStyle, @NotNull SpanStyle style, @NotNull Function1 block) {
/*      */     Object object;
/*      */     Intrinsics.checkNotNullParameter($this$withStyle, "<this>");
/*      */     Intrinsics.checkNotNullParameter(style, "style");
/*      */     Intrinsics.checkNotNullParameter(block, "block");
/*      */     int $i$f$withStyle = 0, index = $this$withStyle.pushStyle(style);
/*      */     try {
/*      */       object = block.invoke($this$withStyle);
/*      */     } finally {
/*      */       InlineMarker.finallyStart(1);
/*      */       $this$withStyle.pop(index);
/*      */       InlineMarker.finallyEnd(1);
/*      */     } 
/*      */     return (R)object;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final <R> R withStyle(@NotNull AnnotatedString.Builder $this$withStyle, @NotNull ParagraphStyle style, @NotNull Function1 block) {
/*      */     Object object;
/*      */     Intrinsics.checkNotNullParameter($this$withStyle, "<this>");
/*      */     Intrinsics.checkNotNullParameter(style, "style");
/*      */     Intrinsics.checkNotNullParameter(block, "block");
/*      */     int $i$f$withStyle = 0, index = $this$withStyle.pushStyle(style);
/*      */     try {
/*      */       object = block.invoke($this$withStyle);
/*      */     } finally {
/*      */       InlineMarker.finallyStart(1);
/*      */       $this$withStyle.pop(index);
/*      */       InlineMarker.finallyEnd(1);
/*      */     } 
/*      */     return (R)object;
/*      */   }
/*      */   
/*      */   @ExperimentalTextApi
/*      */   @NotNull
/*      */   public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder $this$withAnnotation, @NotNull String tag, @NotNull String annotation, @NotNull Function1 block) {
/*      */     Object object;
/*      */     Intrinsics.checkNotNullParameter($this$withAnnotation, "<this>");
/*      */     Intrinsics.checkNotNullParameter(tag, "tag");
/*      */     Intrinsics.checkNotNullParameter(annotation, "annotation");
/*      */     Intrinsics.checkNotNullParameter(block, "block");
/*      */     int $i$f$withAnnotation = 0, index = $this$withAnnotation.pushStringAnnotation(tag, annotation);
/*      */     try {
/*      */       object = block.invoke($this$withAnnotation);
/*      */     } finally {
/*      */       InlineMarker.finallyStart(1);
/*      */       $this$withAnnotation.pop(index);
/*      */       InlineMarker.finallyEnd(1);
/*      */     } 
/*      */     return (R)object;
/*      */   }
/*      */   
/*      */   @ExperimentalTextApi
/*      */   @NotNull
/*      */   public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder $this$withAnnotation, @NotNull TtsAnnotation ttsAnnotation, @NotNull Function1 block) {
/*      */     Object object;
/*      */     Intrinsics.checkNotNullParameter($this$withAnnotation, "<this>");
/*      */     Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
/*      */     Intrinsics.checkNotNullParameter(block, "block");
/*      */     int $i$f$withAnnotation = 0, index = $this$withAnnotation.pushTtsAnnotation(ttsAnnotation);
/*      */     try {
/*      */       object = block.invoke($this$withAnnotation);
/*      */     } finally {
/*      */       InlineMarker.finallyStart(1);
/*      */       $this$withAnnotation.pop(index);
/*      */       InlineMarker.finallyEnd(1);
/*      */     } 
/*      */     return (R)object;
/*      */   }
/*      */   
/*      */   @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "withLink(, block)", imports = {}))
/*      */   @ExperimentalTextApi
/*      */   @NotNull
/*      */   public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder $this$withAnnotation, @NotNull UrlAnnotation urlAnnotation, @NotNull Function1 block) {
/*      */     Object object;
/*      */     Intrinsics.checkNotNullParameter($this$withAnnotation, "<this>");
/*      */     Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
/*      */     Intrinsics.checkNotNullParameter(block, "block");
/*      */     int $i$f$withAnnotation = 0, index = $this$withAnnotation.pushUrlAnnotation(urlAnnotation);
/*      */     try {
/*      */       object = block.invoke($this$withAnnotation);
/*      */     } finally {
/*      */       InlineMarker.finallyStart(1);
/*      */       $this$withAnnotation.pop(index);
/*      */       InlineMarker.finallyEnd(1);
/*      */     } 
/*      */     return (R)object;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final <R> R withLink(@NotNull AnnotatedString.Builder $this$withLink, @NotNull LinkAnnotation link, @NotNull Function1 block) {
/*      */     Object object;
/*      */     Intrinsics.checkNotNullParameter($this$withLink, "<this>");
/*      */     Intrinsics.checkNotNullParameter(link, "link");
/*      */     Intrinsics.checkNotNullParameter(block, "block");
/*      */     int $i$f$withLink = 0, index = $this$withLink.pushLink(link);
/*      */     try {
/*      */       object = block.invoke($this$withLink);
/*      */     } finally {
/*      */       InlineMarker.finallyStart(1);
/*      */       $this$withLink.pop(index);
/*      */       InlineMarker.finallyEnd(1);
/*      */     } 
/*      */     return (R)object;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final AnnotatedString AnnotatedString(@NotNull String text, @NotNull SpanStyle spanStyle, @Nullable ParagraphStyle paragraphStyle) {
/*      */     Intrinsics.checkNotNullParameter(text, "text");
/*      */     Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
/*      */     return new AnnotatedString(text, CollectionsKt.listOf(new AnnotatedString.Range<>(spanStyle, 0, text.length())), (paragraphStyle == null) ? CollectionsKt.emptyList() : CollectionsKt.listOf(new AnnotatedString.Range<>(paragraphStyle, 0, text.length())));
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final AnnotatedString AnnotatedString(@NotNull String text, @NotNull ParagraphStyle paragraphStyle) {
/*      */     Intrinsics.checkNotNullParameter(text, "text");
/*      */     Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
/*      */     return new AnnotatedString(text, CollectionsKt.emptyList(), CollectionsKt.listOf(new AnnotatedString.Range<>(paragraphStyle, 0, text.length())));
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final AnnotatedString buildAnnotatedString(@NotNull Function1 builder) {
/*      */     Intrinsics.checkNotNullParameter(builder, "builder");
/*      */     int $i$f$buildAnnotatedString = 0;
/*      */     AnnotatedString.Builder builder1 = new AnnotatedString.Builder(0, 1, null);
/*      */     builder.invoke(builder1);
/*      */     return builder1.toAnnotatedString();
/*      */   }
/*      */   
/*      */   public static final boolean contains(int baseStart, int baseEnd, int targetStart, int targetEnd) {
/*      */     // Byte code:
/*      */     //   0: iload_0
/*      */     //   1: iload_2
/*      */     //   2: if_icmpgt -> 42
/*      */     //   5: iload_3
/*      */     //   6: iload_1
/*      */     //   7: if_icmpgt -> 42
/*      */     //   10: iload_1
/*      */     //   11: iload_3
/*      */     //   12: if_icmpne -> 38
/*      */     //   15: iload_2
/*      */     //   16: iload_3
/*      */     //   17: if_icmpne -> 24
/*      */     //   20: iconst_1
/*      */     //   21: goto -> 25
/*      */     //   24: iconst_0
/*      */     //   25: iload_0
/*      */     //   26: iload_1
/*      */     //   27: if_icmpne -> 34
/*      */     //   30: iconst_1
/*      */     //   31: goto -> 35
/*      */     //   34: iconst_0
/*      */     //   35: if_icmpne -> 42
/*      */     //   38: iconst_1
/*      */     //   39: goto -> 43
/*      */     //   42: iconst_0
/*      */     //   43: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1251	-> 0
/*      */     //   #1252	-> 10
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	44	0	baseStart	I
/*      */     //   0	44	1	baseEnd	I
/*      */     //   0	44	2	targetStart	I
/*      */     //   0	44	3	targetEnd	I
/*      */   }
/*      */   
/*      */   public static final boolean intersect(int lStart, int lEnd, int rStart, int rEnd) {
/*      */     return (Math.max(lStart, rStart) < Math.min(lEnd, rEnd) || contains(lStart, lEnd, rStart, rEnd) || contains(rStart, rEnd, lStart, lEnd));
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, null, 6, null);
/*      */   
/*      */   @NotNull
/*      */   public static final AnnotatedString emptyAnnotatedString() {
/*      */     return EmptyAnnotatedString;
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\AnnotatedStringKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */