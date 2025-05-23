/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.actions.JunieGrazieLicenseInfoAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.FileListEntry;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.wm.ToolWindow;
/*     */ import com.intellij.ui.components.JBLabel;
/*     */ import com.intellij.ui.content.Content;
/*     */ import com.intellij.ui.content.ContentFactory;
/*     */ import com.intellij.util.messages.MessageBus;
/*     */ import com.intellij.util.messages.SimpleMessageBusConnection;
/*     */ import com.intellij.util.messages.Topic;
/*     */ import java.awt.datatransfer.StringSelection;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.coroutines.channels.ProducerScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000|\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\r\n\002\030\002\n\002\b\004\n\002\020\b\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\032\034\020\000\032\b\022\004\022\0020\0020\0012\f\020\003\032\b\022\004\022\0020\0020\001H\000\032\033\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\005H\000¢\006\004\b\b\020\t\032\024\020\017\032\0020\020*\0020\0202\b\b\002\020\021\032\0020\013\032\024\020\022\032\0020\023*\0020\0242\006\020\025\032\0020\020H\000\032\b\020\026\032\0020\027H\000\032\024\020\030\032\0020\023*\0020\0312\006\020\032\032\0020\020H\000\032\f\020\033\032\0020\023*\0020\031H\000\032\030\020\034\032\0020\0352\006\020\036\032\0020\0372\006\020 \032\0020\024H\000\032\020\020!\032\0020\0232\006\020\"\032\0020\020H\000\032M\020#\032\b\022\004\022\002H%0$\"\b\b\000\020&*\0020'\"\004\b\001\020%*\0020(2\f\020)\032\b\022\004\022\002H&0*2\035\020+\032\031\022\n\022\b\022\004\022\002H%0-\022\004\022\002H&0,¢\006\002\b.\"\025\020\n\032\0020\013*\0020\f8G¢\006\006\032\004\b\r\020\016¨\006/"}, d2 = {"resolveFileNameConflicts", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;", "entries", "substring", "", "Landroidx/compose/ui/text/TextRange;", "text", "substring-72CqOWE", "(JLjava/lang/CharSequence;)Ljava/lang/CharSequence;", "pixels", "", "Landroidx/compose/ui/unit/Dp;", "getPixels", "(FLandroidx/compose/runtime/Composer;I)I", "toSafeFileName", "", "maxLength", "showThemeUnsupportedMessage", "", "Lcom/intellij/openapi/project/Project;", "themeName", "isWindowsArm64", "", "showUnsupportedArchMessage", "Lcom/intellij/openapi/wm/ToolWindow;", "arch", "showRemoteDevNotSupportedMessage", "buildToolWindowActions", "Lcom/intellij/openapi/actionSystem/ActionGroup;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;", "project", "copyStringToClipboard", "string", "connectionFlow", "Lkotlinx/coroutines/flow/Flow;", "K", "T", "", "Lcom/intellij/util/messages/MessageBus;", "topic", "Lcom/intellij/util/messages/Topic;", "listenerFactory", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/ExtensionFunctionType;", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,226:1\n1485#2:227\n1510#2,3:228\n1513#2,3:238\n1557#2:241\n1628#2,3:242\n1279#2,2:245\n1293#2,4:247\n1485#2:251\n1510#2,3:252\n1513#2,3:262\n1863#2:272\n1863#2,2:273\n1864#2:275\n1557#2:276\n1628#2,3:277\n381#3,7:231\n381#3,7:255\n503#3,7:265\n77#4:280\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/UtilsKt\n*L\n40#1:227\n40#1:228,3\n40#1:238,3\n46#1:241\n46#1:242,3\n47#1:245,2\n47#1:247,4\n50#1:251\n50#1:252,3\n50#1:262,3\n57#1:272\n58#1:273,2\n57#1:275\n69#1:276\n69#1:277,3\n40#1:231,7\n50#1:255,7\n51#1:265,7\n122#1:280\n*E\n"})
/*     */ public final class UtilsKt {
/*     */   @NotNull
/*  39 */   public static final List<FileListEntry> resolveFileNameConflicts(@NotNull List entries) { Intrinsics.checkNotNullParameter(entries, "entries"); List<FileListEntry> result = new ArrayList();
/*  40 */     Iterable $this$groupBy$iv = entries; int $i$f$groupBy = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 227 */     Iterable iterable1 = $this$groupBy$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(); int $i$f$groupByTo = 0;
/* 228 */     for (Object element$iv$iv : iterable1) {
/* 229 */       FileListEntry it = (FileListEntry)element$iv$iv; int $i$a$-groupBy-UtilsKt$resolveFileNameConflicts$grouped$1 = 0; Object key$iv$iv = it.getFileName();
/* 230 */       Map<Object, Object> $this$getOrPut$iv$iv$iv = destination$iv$iv; int $i$f$getOrPut = 0;
/* 231 */       Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 240 */     Map<Object, Object> grouped = destination$iv$iv; for (Iterator<Map.Entry> iterator = grouped.entrySet().iterator(); iterator.hasNext(); ) { List group = (List)((Map.Entry)iterator.next()).getValue(); if (group.size() == 1) { result.add(group.get(0)); continue; }
/* 241 */        Iterable $this$map$iv = group; int $i$f$map = 0; Iterable iterable3 = $this$map$iv; Collection<CollisionEntry> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 242 */       for (Object item$iv$iv : iterable3) {
/* 243 */         FileListEntry fileListEntry = (FileListEntry)item$iv$iv; Collection<CollisionEntry> collection2 = collection; int $i$a$-map-UtilsKt$resolveFileNameConflicts$collisionEntries$1 = 0; collection2.add(new CollisionEntry(fileListEntry));
/* 244 */       }  List<FileListEntry> collisionEntries = (List)collection; Iterable<FileListEntry> $this$associateWith$iv = collisionEntries; int $i$f$associateWith = 0;
/* 245 */       LinkedHashMap<Object, Object> result$iv = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateWith$iv, 10)), 16));
/* 246 */       Iterable<FileListEntry> $this$associateWithTo$iv$iv = $this$associateWith$iv; int $i$f$associateWithTo = 0;
/* 247 */       for (Object element$iv$iv : $this$associateWithTo$iv$iv) {
/* 248 */         CollisionEntry collisionEntry = (CollisionEntry)element$iv$iv; Object object1 = element$iv$iv; LinkedHashMap<Object, Object> linkedHashMap = result$iv; int $i$a$-associateWith-UtilsKt$resolveFileNameConflicts$maxDepths$1 = 0; Integer integer = Integer.valueOf(collisionEntry.getReversedParents().size()); linkedHashMap.put(object1, integer);
/*     */       } 
/* 250 */       Map<Object, Object> maxDepths = result$iv; while (true) {
/* 251 */         boolean anyIncremented; Iterator iterator1; Iterable<FileListEntry> iterable = collisionEntries; int k = 0; $this$associateWithTo$iv$iv = iterable; Map<Object, Object> map1 = new LinkedHashMap<>(); int m = 0;
/* 252 */         for (Object element$iv$iv : $this$associateWithTo$iv$iv) {
/* 253 */           CollisionEntry it = (CollisionEntry)element$iv$iv; int $i$a$-groupBy-UtilsKt$resolveFileNameConflicts$collisionsMap$1 = 0; Object key$iv$iv = it.buildDisambiguatedName();
/* 254 */           Map<Object, Object> $this$getOrPut$iv$iv$iv = map1; int $i$f$getOrPut = 0;
/* 255 */           Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 264 */         Map<Object, Object> collisionsMap = map1; Map<Object, Object> $this$filterValues$iv = collisionsMap; int $i$f$filterValues = 0;
/* 265 */         LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
/* 266 */         for (Map.Entry<Object, Object> entry$iv : $this$filterValues$iv.entrySet()) {
/* 267 */           List it = (List)entry$iv.getValue(); int $i$a$-filterValues-UtilsKt$resolveFileNameConflicts$multiCollisions$1 = 0; if ((it.size() > 1)) {
/* 268 */             linkedHashMap.put(entry$iv.getKey(), entry$iv.getValue());
/*     */           }
/*     */         } 
/* 271 */         Map<Object, Object> multiCollisions = linkedHashMap; if (!multiCollisions.isEmpty())
/* 272 */         { anyIncremented = false; Iterable $this$forEach$iv = multiCollisions.values(); int $i$f$forEach = 0; iterator1 = $this$forEach$iv.iterator(); } else { break; }  if (iterator1.hasNext()) { Object element$iv = iterator1.next(); List sameNameList = (List)element$iv; int $i$a$-forEach-UtilsKt$resolveFileNameConflicts$1 = 0; Iterable $this$forEach$iv = sameNameList; int $i$f$forEach = 0;
/* 273 */           Iterator iterator2 = $this$forEach$iv.iterator(); }
/*     */          if (!anyIncremented)
/*     */           break; 
/* 276 */       }  $this$associateWith$iv = result; Iterable<FileListEntry> iterable2 = collisionEntries; int i = 0; Iterable<FileListEntry> $this$groupByTo$iv$iv = iterable2; Collection<FileListEntry> collection1 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10)); int j = 0;
/* 277 */       for (Object item$iv$iv : $this$groupByTo$iv$iv) {
/* 278 */         CollisionEntry collisionEntry = (CollisionEntry)item$iv$iv; Collection<FileListEntry> collection2 = collection1; int $i$a$-map-UtilsKt$resolveFileNameConflicts$2 = 0; collection2.add(FileListEntry.copy$default(collisionEntry.getSource(), collisionEntry.buildDisambiguatedName(), null, null, 6, null));
/* 279 */       }  Iterable $this$mapTo$iv$iv = collection1; CollectionsKt.addAll((Collection)$this$associateWith$iv, $this$mapTo$iv$iv); }  return result; }
/* 280 */   @NotNull public static final CharSequence substring-72CqOWE(long $this$substring_u2d72CqOWE, @NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); int start = RangesKt.coerceIn(TextRange.getStart-impl($this$substring_u2d72CqOWE), 0, text.length()); int end = RangesKt.coerceIn(TextRange.getEnd-impl($this$substring_u2d72CqOWE), 0, text.length()); return text.subSequence(Math.min(start, end), Math.max(start, end)); } @Composable @JvmName(name = "getPixels") public static final int getPixels(float $this$pixels, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(1600784206); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1600784206, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.<get-pixels> (Utils.kt:120)");  CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalDensity(); int $changed$iv = 0, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); Density density = (Density)object;
/*     */     int i = (int)(density.getDensity() * $this$pixels);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return i; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String toSafeFileName(@NotNull String $this$toSafeFileName, int maxLength) {
/*     */     Intrinsics.checkNotNullParameter($this$toSafeFileName, "<this>");
/*     */     CharSequence charSequence = $this$toSafeFileName;
/*     */     Regex regex = new Regex("[\\\\/:*?\"<>|]");
/*     */     String str1 = "_";
/*     */     charSequence = regex.replace(charSequence, str1);
/*     */     regex = new Regex("\\s+");
/*     */     str1 = "_";
/*     */     char[] arrayOfChar = new char[1];
/*     */     arrayOfChar[0] = '_';
/*     */     String sanitized = StringsKt.trim(regex.replace(charSequence, str1), arrayOfChar);
/*     */     return (sanitized.length() <= maxLength) ? sanitized : StringsKt.take(sanitized, maxLength);
/*     */   }
/*     */   
/*     */   public static final void showThemeUnsupportedMessage(@NotNull Project $this$showThemeUnsupportedMessage, @NotNull String themeName) {
/*     */     Intrinsics.checkNotNullParameter($this$showThemeUnsupportedMessage, "<this>");
/*     */     Intrinsics.checkNotNullParameter(themeName, "themeName");
/*     */     NotificationGroupManager.getInstance().getNotificationGroup("Junie").createNotification("Junie", "Current theme <b>" + themeName + "</b> may not be supported by Junie. If you encounter any issues, please change to a default theme and reopen the project.", NotificationType.WARNING).notify($this$showThemeUnsupportedMessage);
/*     */   }
/*     */   
/*     */   public static final boolean isWindowsArm64() {
/*     */     String osArch = System.getProperty("os.arch");
/*     */     String osName = System.getProperty("os.name");
/*     */     Intrinsics.checkNotNull(osName);
/*     */     boolean isWindows = StringsKt.contains(osName, "windows", true);
/*     */     Intrinsics.checkNotNull(osArch);
/*     */     boolean isArm = (StringsKt.contains(osArch, "aarch", true) || StringsKt.contains(osArch, "arm", true));
/*     */     return (isWindows && isArm);
/*     */   }
/*     */   
/*     */   public static final void showUnsupportedArchMessage(@NotNull ToolWindow $this$showUnsupportedArchMessage, @NotNull String arch) {
/*     */     Intrinsics.checkNotNullParameter($this$showUnsupportedArchMessage, "<this>");
/*     */     Intrinsics.checkNotNullParameter(arch, "arch");
/*     */     JBLabel jBLabel1 = new JBLabel("Current architecture <b>" + arch + "</b> is not supported by Junie. We are working on it. Sorry for the inconvenience!");
/*     */     JBLabel $this$showUnsupportedArchMessage_u24lambda_u248 = jBLabel1;
/*     */     int $i$a$-apply-UtilsKt$showUnsupportedArchMessage$messagePanel$1 = 0;
/*     */     $this$showUnsupportedArchMessage_u24lambda_u248.setBorder(JBUI.Borders.empty(10));
/*     */     JBLabel messagePanel = jBLabel1;
/*     */     Intrinsics.checkNotNullExpressionValue(ContentFactory.getInstance().createContent((JComponent)messagePanel, "", false), "createContent(...)");
/*     */     Content content = ContentFactory.getInstance().createContent((JComponent)messagePanel, "", false);
/*     */     $this$showUnsupportedArchMessage.getContentManager().addContent(content);
/*     */   }
/*     */   
/*     */   public static final void showRemoteDevNotSupportedMessage(@NotNull ToolWindow $this$showRemoteDevNotSupportedMessage) {
/*     */     Intrinsics.checkNotNullParameter($this$showRemoteDevNotSupportedMessage, "<this>");
/*     */     JBLabel jBLabel1 = new JBLabel("<html><center>Remote development mode is currently not supported.<br>Sorry for the inconvenience!</center></html>");
/*     */     JBLabel $this$showRemoteDevNotSupportedMessage_u24lambda_u249 = jBLabel1;
/*     */     int $i$a$-apply-UtilsKt$showRemoteDevNotSupportedMessage$messagePanel$1 = 0;
/*     */     $this$showRemoteDevNotSupportedMessage_u24lambda_u249.setBorder(JBUI.Borders.empty(10));
/*     */     JBLabel messagePanel = jBLabel1;
/*     */     Intrinsics.checkNotNullExpressionValue(ContentFactory.getInstance().createContent((JComponent)messagePanel, "", false), "createContent(...)");
/*     */     Content content = ContentFactory.getInstance().createContent((JComponent)messagePanel, "", false);
/*     */     $this$showRemoteDevNotSupportedMessage.getContentManager().addContent(content);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ActionGroup buildToolWindowActions(@NotNull JuniorToolWindowViewModel model, @NotNull Project project) {
/*     */     Intrinsics.checkNotNullParameter(model, "model");
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     return new UtilsKt$buildToolWindowActions$1(project, model);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J!\020\002\032\f\022\b\b\001\022\004\030\0010\0040\0032\b\020\005\032\004\030\0010\006H\026¢\006\002\020\007¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/UtilsKt$buildToolWindowActions$1", "Lcom/intellij/openapi/actionSystem/ActionGroup;", "getChildren", "", "Lcom/intellij/openapi/actionSystem/AnAction;", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "(Lcom/intellij/openapi/actionSystem/AnActionEvent;)[Lcom/intellij/openapi/actionSystem/AnAction;", "ej-ui"})
/*     */   @SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/UtilsKt$buildToolWindowActions$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,226:1\n1#2:227\n37#3,2:228\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/UtilsKt$buildToolWindowActions$1\n*L\n197#1:228,2\n*E\n"})
/*     */   public static final class UtilsKt$buildToolWindowActions$1 extends ActionGroup {
/*     */     UtilsKt$buildToolWindowActions$1(Project $project, JuniorToolWindowViewModel $model) {
/*     */       super("Junie", false);
/*     */     }
/*     */     
/*     */     public AnAction[] getChildren(AnActionEvent e) {
/*     */       AnAction[] arrayOfAnAction1 = new AnAction[4];
/*     */       arrayOfAnAction1[0] = (AnAction)new ShowSettingsAction(this.$project);
/*     */       JunieGrazieLicenseInfoAction junieGrazieLicenseInfoAction1 = new JunieGrazieLicenseInfoAction(), junieGrazieLicenseInfoAction2 = junieGrazieLicenseInfoAction1;
/*     */       boolean bool = true;
/*     */       AnAction[] arrayOfAnAction2 = arrayOfAnAction1;
/*     */       int $i$a$-takeIf-UtilsKt$buildToolWindowActions$1$getChildren$publicActions$1 = 0;
/*     */       boolean bool1 = BuildConfigKt.getConfig().getHasJbAI();
/*     */       arrayOfAnAction2[bool] = bool1 ? (AnAction)junieGrazieLicenseInfoAction1 : null;
/*     */       arrayOfAnAction1[2] = new ShowJunieFeedbackDialogAction();
/*     */       arrayOfAnAction1[3] = (AnAction)new LogoutAction(new UtilsKt$buildToolWindowActions$1$getChildren$publicActions$2(this.$model), new UtilsKt$buildToolWindowActions$1$getChildren$publicActions$3(this.$model));
/*     */       List publicActions = CollectionsKt.listOfNotNull((Object[])arrayOfAnAction1);
/*     */       List internalActions = CollectionsKt.emptyList();
/*     */       boolean isInternal = ApplicationManager.getApplication().isInternal();
/*     */       Collection $this$toTypedArray$iv = isInternal ? CollectionsKt.plus(publicActions, internalActions) : publicActions;
/*     */       int $i$f$toTypedArray = 0;
/*     */       Collection thisCollection$iv = $this$toTypedArray$iv;
/*     */       return (AnAction[])thisCollection$iv.toArray((Object[])new AnAction[0]);
/*     */     }
/*     */   }
/*     */   
/*     */   public static final void copyStringToClipboard(@NotNull String string) {
/*     */     Intrinsics.checkNotNullParameter(string, "string");
/*     */     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
/*     */     StringSelection selection = new StringSelection(string);
/*     */     clipboard.setContents(selection, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <T, K> Flow<K> connectionFlow(@NotNull MessageBus $this$connectionFlow, @NotNull Topic<T> topic, @NotNull Function1<? super ProducerScope<? super K>, ? extends T> listenerFactory) {
/*     */     Intrinsics.checkNotNullParameter($this$connectionFlow, "<this>");
/*     */     Intrinsics.checkNotNullParameter(topic, "topic");
/*     */     Intrinsics.checkNotNullParameter(listenerFactory, "listenerFactory");
/*     */     return FlowKt.channelFlow(new UtilsKt$connectionFlow$1(listenerFactory, $this$connectionFlow, topic, null));
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Utils.kt", l = {220}, i = {0}, s = {"L$0"}, n = {"connection"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.UtilsKt$connectionFlow$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\n"}, d2 = {"<anonymous>", "", "K", "Lkotlinx/coroutines/channels/ProducerScope;"})
/*     */   static final class UtilsKt$connectionFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super K>, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     UtilsKt$connectionFlow$1(Function1<ProducerScope<? super K>, T> $listenerFactory, MessageBus $receiver, Topic<T> $topic, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       ProducerScope $this$channelFlow;
/*     */       Object listener;
/*     */       SimpleMessageBusConnection connection;
/*     */       Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$channelFlow = (ProducerScope)this.L$0;
/*     */           listener = this.$listenerFactory.invoke($this$channelFlow);
/*     */           connection = this.$this_connectionFlow.simpleConnect();
/*     */           try {
/*     */             connection.subscribe(this.$topic, listener);
/*     */             this.L$0 = connection;
/*     */             this.label = 1;
/*     */             if (ProduceKt.awaitClose$default($this$channelFlow, null, (Continuation)this, 1, null) == object1)
/*     */               return object1; 
/*     */             ProduceKt.awaitClose$default($this$channelFlow, null, (Continuation)this, 1, null);
/*     */           } finally {
/*     */             connection.disconnect();
/*     */           } 
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           connection = (SimpleMessageBusConnection)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           connection.disconnect();
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super UtilsKt$connectionFlow$1> $completion) {
/*     */       UtilsKt$connectionFlow$1 utilsKt$connectionFlow$1 = new UtilsKt$connectionFlow$1(this.$listenerFactory, this.$this_connectionFlow, this.$topic, $completion);
/*     */       utilsKt$connectionFlow$1.L$0 = value;
/*     */       return (Continuation<Unit>)utilsKt$connectionFlow$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*     */       return ((UtilsKt$connectionFlow$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\UtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */