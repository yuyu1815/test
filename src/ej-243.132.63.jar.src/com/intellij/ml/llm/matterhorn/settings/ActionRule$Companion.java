/*     */ package com.intellij.ml.llm.matterhorn.settings;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ActionType;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\t\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\"\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\035\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\005H\000¢\006\002\b\013J*\020\f\032\b\022\004\022\0020\0160\r2\f\020\017\032\b\022\004\022\0020\0160\r2\006\020\020\032\0020\0212\006\020\022\032\0020\tJ8\020\023\032\b\022\004\022\0020\0160\r2\f\020\017\032\b\022\004\022\0020\0160\r2\006\020\020\032\0020\0212\006\020\022\032\0020\t2\f\020\024\032\b\022\004\022\0020\0160\025J\026\020\026\032\0020\0162\006\020\020\032\0020\0212\006\020\022\032\0020\tJ\030\020\027\032\004\030\0010\0162\006\020\020\032\0020\0212\006\020\022\032\0020\tR\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/settings/ActionRule$Companion;", "", "<init>", "()V", "MAX_BOMBED_TIMEOUT_MS", "", "getBombedCharSequence", "Lcom/intellij/openapi/util/text/StringUtil$BombedCharSequence;", "text", "", "delayMillis", "getBombedCharSequence$core", "findExactRules", "", "Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;", "whitelist", "actionType", "Lcom/intellij/ml/llm/matterhorn/ActionType;", "action", "findSimilarRules", "excludedRules", "", "getExactRule", "getSimilarRule", "core"})
/*     */ @SourceDebugExtension({"SMAP\nActionRule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionRule.kt\ncom/intellij/ml/llm/matterhorn/settings/ActionRule$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n774#2:121\n865#2,2:122\n774#2:124\n865#2,2:125\n14#3:127\n14#3:129\n1#4:128\n*S KotlinDebug\n*F\n+ 1 ActionRule.kt\ncom/intellij/ml/llm/matterhorn/settings/ActionRule$Companion\n*L\n30#1:121\n30#1:122,2\n42#1:124\n42#1:125,2\n49#1:127\n85#1:129\n*E\n"})
/*     */ public final class Companion {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*  15 */   public final StringUtil.BombedCharSequence getBombedCharSequence$core(@NotNull String text, long delayMillis) { Intrinsics.checkNotNullParameter(text, "text"); long untilTime = System.currentTimeMillis() + delayMillis;
/*  16 */     return new ActionRule$Companion$getBombedCharSequence$1(text, untilTime); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\024¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/settings/ActionRule$Companion$getBombedCharSequence$1", "Lcom/intellij/openapi/util/text/StringUtil$BombedCharSequence;", "checkCanceled", "", "core"}) public static final class ActionRule$Companion$getBombedCharSequence$1 extends StringUtil.BombedCharSequence { ActionRule$Companion$getBombedCharSequence$1(String $text, long $untilTime) { super($text); }
/*     */      protected void checkCanceled() {
/*  18 */       long l = System.currentTimeMillis();
/*  19 */       if (l >= this.$untilTime) {
/*  20 */         throw new TimeoutException();
/*     */       }
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<ActionRule> findExactRules(@NotNull List whitelist, @NotNull ActionType actionType, @NotNull String action) {
/*  27 */     Intrinsics.checkNotNullParameter(whitelist, "whitelist"); Intrinsics.checkNotNullParameter(actionType, "actionType"); Intrinsics.checkNotNullParameter(action, "action");
/*     */     
/*  29 */     ActionRule exactRule = getExactRule(actionType, action);
/*  30 */     Iterable $this$filter$iv = whitelist; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 121 */     Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 122 */     for (Object element$iv$iv : iterable1) { ActionRule it = (ActionRule)element$iv$iv; int $i$a$-filter-ActionRule$Companion$findExactRules$1 = 0; if (Intrinsics.areEqual(it, exactRule)) destination$iv$iv.add(element$iv$iv);  }
/* 123 */      return (WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()] == 1) ? (List)destination$iv$iv : CollectionsKt.emptyList(); } @NotNull public final List<ActionRule> findSimilarRules(@NotNull List whitelist, @NotNull ActionType actionType, @NotNull String action, @NotNull Set excludedRules) { Intrinsics.checkNotNullParameter(whitelist, "whitelist"); Intrinsics.checkNotNullParameter(actionType, "actionType"); Intrinsics.checkNotNullParameter(action, "action"); Intrinsics.checkNotNullParameter(excludedRules, "excludedRules"); Iterable $this$filter$iv = whitelist; int $i$f$filter = 0;
/* 124 */     Iterable iterable1 = $this$filter$iv; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 125 */     for (Object element$iv$iv : iterable1) { ActionRule it = (ActionRule)element$iv$iv; int $i$a$-filter-ActionRule$Companion$findSimilarRules$1 = 0; if ((!excludedRules.contains(it) && it.getActionType() == actionType)) collection.add(element$iv$iv);  }
/* 126 */      $this$filter$iv = collection; $i$f$filter = 0; Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); $i$f$filterTo = 0; for (Object element$iv$iv : $this$filterTo$iv$iv) { boolean bool; ActionRule it = (ActionRule)element$iv$iv; int $i$a$-filter-ActionRule$Companion$findSimilarRules$2 = 0; try { StringUtil.BombedCharSequence bombed = ActionRule.Companion.getBombedCharSequence$core(StringsKt.trim(action).toString(), 1000L); it.getRegex(); bool = (it.getRegex() != null) ? it.getRegex().matches((CharSequence)bombed) : false; }
/* 127 */       catch (TimeoutException <unused var>) { int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ActionRule.class), "getInstance(...)"); Logger.getInstance(ActionRule.class).warn("Regex " + it.getActionRegex() + " timeout for " + action); bool = false; }  }
/* 128 */      return (List<ActionRule>)destination$iv$iv; } @Nullable public final ActionRule getSimilarRule(@NotNull ActionType actionType, @NotNull String action) { ActionRule actionRule; Intrinsics.checkNotNullParameter(actionType, "actionType"); Intrinsics.checkNotNullParameter(action, "action"); try { CharSequence charSequence = StringsKt.trim(action).toString(); Regex regex = new Regex("\\s+"); boolean bool = false; List words = regex.split(charSequence, bool); int lastIndex = StringsKt.lastIndexOf$default(action, (String)CollectionsKt.last(words), 0, false, 6, null); Intrinsics.checkNotNullExpressionValue(action.substring(0, lastIndex), "substring(...)"); String prefix = action.substring(0, lastIndex); String escapedPrefix = Pattern.quote(prefix); String pattern = (WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()] == 1) ? ((words.size() <= 1 || lastIndex < 0) ? null : ("^" + escapedPrefix + "\\S+$")) : "*"; String it = pattern; int $i$a$-let-ActionRule$Companion$getSimilarRule$1 = 0; actionRule = (pattern != null) ? new ActionRule(actionType, it) : null; }
/* 129 */     catch (Exception e) { int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ActionRule.class), "getInstance(...)"); Logger.getInstance(ActionRule.class).warn("Error getting similar rule", e);
/*     */       actionRule = null; }
/*     */     
/*     */     return actionRule; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ActionRule getExactRule(@NotNull ActionType actionType, @NotNull String action) {
/*     */     Intrinsics.checkNotNullParameter(actionType, "actionType");
/*     */     Intrinsics.checkNotNullParameter(action, "action");
/*     */     String pattern = (WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()] == 1) ? ("^" + Regex.Companion.escape(StringsKt.trim(action).toString()) + "$") : "";
/*     */     return new ActionRule(actionType, pattern);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\settings\ActionRule$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */