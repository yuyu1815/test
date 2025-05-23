/*     */ package com.intellij.ml.llm.matterhorn.settings;
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\t\n\002\020\b\n\002\b\003\b\b\030\000 \0372\0020\001:\001\037B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\026\020\022\032\0020\0232\006\020\024\032\0020\0052\006\020\025\032\0020\003J\006\020\026\032\0020\023J\t\020\027\032\0020\003HÆ\003J\t\020\030\032\0020\005HÆ\003J\035\020\031\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\032\032\0020\0232\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\035HÖ\001J\t\020\036\032\0020\005HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\035\020\f\032\004\030\0010\r8FX\002¢\006\f\n\004\b\020\020\021\032\004\b\016\020\017¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;", "", "actionType", "Lcom/intellij/ml/llm/matterhorn/ActionType;", "actionRegex", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ActionType;Ljava/lang/String;)V", "getActionType", "()Lcom/intellij/ml/llm/matterhorn/ActionType;", "getActionRegex", "()Ljava/lang/String;", "regex", "Lkotlin/text/Regex;", "getRegex", "()Lkotlin/text/Regex;", "regex$delegate", "Lkotlin/Lazy;", "check", "", "checkAction", "checkType", "validate", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "core"})
/*     */ @SourceDebugExtension({"SMAP\nActionRule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionRule.kt\ncom/intellij/ml/llm/matterhorn/settings/ActionRule\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,120:1\n14#2:121\n14#2:122\n*S KotlinDebug\n*F\n+ 1 ActionRule.kt\ncom/intellij/ml/llm/matterhorn/settings/ActionRule\n*L\n108#1:121\n94#1:122\n*E\n"})
/*     */ public final class ActionRule {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final ActionType actionType;
/*     */   
/*  10 */   public ActionRule(@NotNull ActionType actionType, @NotNull String actionRegex) { this.actionType = actionType; this.actionRegex = actionRegex;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     this.regex$delegate = LazyKt.lazy(this::regex_delegate$lambda$0); } @NotNull
/*     */   private final String actionRegex; @NotNull
/*     */   private final Lazy regex$delegate; public static final long MAX_BOMBED_TIMEOUT_MS = 1000L; @NotNull
/*     */   public final ActionType getActionType() {
/*     */     return this.actionType;
/*     */   } @NotNull
/*     */   public final String getActionRegex() {
/*     */     return this.actionRegex;
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\t\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\"\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\035\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\005H\000¢\006\002\b\013J*\020\f\032\b\022\004\022\0020\0160\r2\f\020\017\032\b\022\004\022\0020\0160\r2\006\020\020\032\0020\0212\006\020\022\032\0020\tJ8\020\023\032\b\022\004\022\0020\0160\r2\f\020\017\032\b\022\004\022\0020\0160\r2\006\020\020\032\0020\0212\006\020\022\032\0020\t2\f\020\024\032\b\022\004\022\0020\0160\025J\026\020\026\032\0020\0162\006\020\020\032\0020\0212\006\020\022\032\0020\tJ\030\020\027\032\004\030\0010\0162\006\020\020\032\0020\0212\006\020\022\032\0020\tR\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/settings/ActionRule$Companion;", "", "<init>", "()V", "MAX_BOMBED_TIMEOUT_MS", "", "getBombedCharSequence", "Lcom/intellij/openapi/util/text/StringUtil$BombedCharSequence;", "text", "", "delayMillis", "getBombedCharSequence$core", "findExactRules", "", "Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;", "whitelist", "actionType", "Lcom/intellij/ml/llm/matterhorn/ActionType;", "action", "findSimilarRules", "excludedRules", "", "getExactRule", "getSimilarRule", "core"})
/*     */   @SourceDebugExtension({"SMAP\nActionRule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionRule.kt\ncom/intellij/ml/llm/matterhorn/settings/ActionRule$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n774#2:121\n865#2,2:122\n774#2:124\n865#2,2:125\n14#3:127\n14#3:129\n1#4:128\n*S KotlinDebug\n*F\n+ 1 ActionRule.kt\ncom/intellij/ml/llm/matterhorn/settings/ActionRule$Companion\n*L\n30#1:121\n30#1:122,2\n42#1:124\n42#1:125,2\n49#1:127\n85#1:129\n*E\n"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*     */     public final StringUtil.BombedCharSequence getBombedCharSequence$core(@NotNull String text, long delayMillis) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       long untilTime = System.currentTimeMillis() + delayMillis;
/*     */       return new ActionRule$Companion$getBombedCharSequence$1(text, untilTime);
/*     */     } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\024¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/settings/ActionRule$Companion$getBombedCharSequence$1", "Lcom/intellij/openapi/util/text/StringUtil$BombedCharSequence;", "checkCanceled", "", "core"})
/*     */     public static final class ActionRule$Companion$getBombedCharSequence$1 extends StringUtil.BombedCharSequence {
/*     */       ActionRule$Companion$getBombedCharSequence$1(String $text, long $untilTime) {
/*     */         super($text);
/*     */       } protected void checkCanceled() {
/*     */         long l = System.currentTimeMillis();
/*     */         if (l >= this.$untilTime)
/*     */           throw new TimeoutException(); 
/*     */       } } @NotNull
/*     */     public final List<ActionRule> findExactRules(@NotNull List whitelist, @NotNull ActionType actionType, @NotNull String action) {
/*     */       Intrinsics.checkNotNullParameter(whitelist, "whitelist");
/*     */       Intrinsics.checkNotNullParameter(actionType, "actionType");
/*     */       Intrinsics.checkNotNullParameter(action, "action");
/*     */       ActionRule exactRule = getExactRule(actionType, action);
/*     */       Iterable $this$filter$iv = whitelist;
/*     */       int $i$f$filter = 0;
/* 121 */       Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 122 */       for (Object element$iv$iv : iterable1) { ActionRule it = (ActionRule)element$iv$iv; int $i$a$-filter-ActionRule$Companion$findExactRules$1 = 0; if (Intrinsics.areEqual(it, exactRule)) destination$iv$iv.add(element$iv$iv);  }
/* 123 */        return (WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()] == 1) ? (List)destination$iv$iv : CollectionsKt.emptyList(); } @NotNull public final List<ActionRule> findSimilarRules(@NotNull List whitelist, @NotNull ActionType actionType, @NotNull String action, @NotNull Set excludedRules) { Intrinsics.checkNotNullParameter(whitelist, "whitelist"); Intrinsics.checkNotNullParameter(actionType, "actionType"); Intrinsics.checkNotNullParameter(action, "action"); Intrinsics.checkNotNullParameter(excludedRules, "excludedRules"); Iterable $this$filter$iv = whitelist; int $i$f$filter = 0;
/* 124 */       Iterable iterable1 = $this$filter$iv; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 125 */       for (Object element$iv$iv : iterable1) { ActionRule it = (ActionRule)element$iv$iv; int $i$a$-filter-ActionRule$Companion$findSimilarRules$1 = 0; if ((!excludedRules.contains(it) && it.getActionType() == actionType)) collection.add(element$iv$iv);  }
/* 126 */        $this$filter$iv = collection; $i$f$filter = 0; Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); $i$f$filterTo = 0; for (Object element$iv$iv : $this$filterTo$iv$iv) { boolean bool; ActionRule it = (ActionRule)element$iv$iv; int $i$a$-filter-ActionRule$Companion$findSimilarRules$2 = 0; try { StringUtil.BombedCharSequence bombed = ActionRule.Companion.getBombedCharSequence$core(StringsKt.trim(action).toString(), 1000L); it.getRegex(); bool = (it.getRegex() != null) ? it.getRegex().matches((CharSequence)bombed) : false; }
/* 127 */         catch (TimeoutException <unused var>) { int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ActionRule.class), "getInstance(...)"); Logger.getInstance(ActionRule.class).warn("Regex " + it.getActionRegex() + " timeout for " + action); bool = false; }  }
/* 128 */        return (List<ActionRule>)destination$iv$iv; } @Nullable public final ActionRule getSimilarRule(@NotNull ActionType actionType, @NotNull String action) { ActionRule actionRule; Intrinsics.checkNotNullParameter(actionType, "actionType"); Intrinsics.checkNotNullParameter(action, "action"); try { CharSequence charSequence = StringsKt.trim(action).toString(); Regex regex = new Regex("\\s+"); boolean bool = false; List words = regex.split(charSequence, bool); int lastIndex = StringsKt.lastIndexOf$default(action, (String)CollectionsKt.last(words), 0, false, 6, null); Intrinsics.checkNotNullExpressionValue(action.substring(0, lastIndex), "substring(...)"); String prefix = action.substring(0, lastIndex); String escapedPrefix = Pattern.quote(prefix); String pattern = (WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()] == 1) ? ((words.size() <= 1 || lastIndex < 0) ? null : ("^" + escapedPrefix + "\\S+$")) : "*"; String it = pattern; int $i$a$-let-ActionRule$Companion$getSimilarRule$1 = 0; actionRule = (pattern != null) ? new ActionRule(actionType, it) : null; }
/* 129 */       catch (Exception e) { int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ActionRule.class), "getInstance(...)"); Logger.getInstance(ActionRule.class).warn("Error getting similar rule", e);
/*     */         actionRule = null; }
/*     */       
/*     */       return actionRule; }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final ActionRule getExactRule(@NotNull ActionType actionType, @NotNull String action) {
/*     */       Intrinsics.checkNotNullParameter(actionType, "actionType");
/*     */       Intrinsics.checkNotNullParameter(action, "action");
/*     */       String pattern = (WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()] == 1) ? ("^" + Regex.Companion.escape(StringsKt.trim(action).toString()) + "$") : "";
/*     */       return new ActionRule(actionType, pattern);
/*     */     } }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Regex getRegex() {
/*     */     Lazy lazy = this.regex$delegate;
/*     */     return (Regex)lazy.getValue();
/*     */   }
/*     */   
/*     */   private static final Regex regex_delegate$lambda$0(ActionRule this$0) {
/*     */     Regex regex;
/*     */     try {
/*     */       regex = new Regex(this$0.actionRegex);
/*     */     } catch (Exception e) {
/*     */       int $i$f$logger = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ActionRule.class), "getInstance(...)");
/*     */       Logger.getInstance(ActionRule.class).warn("Error parsing regex " + this$0.actionRegex + " for " + this$0.actionType + ":", e);
/*     */       regex = null;
/*     */     } 
/*     */     return regex;
/*     */   }
/*     */   
/*     */   public final boolean check(@NotNull String checkAction, @NotNull ActionType checkType) {
/*     */     boolean bool;
/*     */     Intrinsics.checkNotNullParameter(checkAction, "checkAction");
/*     */     Intrinsics.checkNotNullParameter(checkType, "checkType");
/*     */     if (checkType != this.actionType)
/*     */       return false; 
/*     */     switch (WhenMappings.$EnumSwitchMapping$0[this.actionType.ordinal()]) {
/*     */       case 1:
/*     */         try {
/*     */           StringUtil.BombedCharSequence bombed = Companion.getBombedCharSequence$core(StringsKt.trim(checkAction).toString(), 1000L);
/*     */           getRegex();
/*     */           bool = (getRegex() != null) ? getRegex().matches((CharSequence)bombed) : false;
/*     */         } catch (TimeoutException <unused var>) {
/*     */           int $i$f$logger = 0;
/*     */           Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ActionRule.class), "getInstance(...)");
/*     */           Logger.getInstance(ActionRule.class).warn("Regex " + this.actionRegex + " timeout for " + checkAction);
/*     */           bool = false;
/*     */         } 
/*     */       case 2:
/*     */       case 3:
/*     */       
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   public final boolean validate() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield actionType : Lcom/intellij/ml/llm/matterhorn/ActionType;
/*     */     //   4: invokevirtual isWhitelistSupported : ()Z
/*     */     //   7: ifeq -> 111
/*     */     //   10: aload_0
/*     */     //   11: getfield actionType : Lcom/intellij/ml/llm/matterhorn/ActionType;
/*     */     //   14: getstatic com/intellij/ml/llm/matterhorn/settings/ActionRule$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   17: swap
/*     */     //   18: invokevirtual ordinal : ()I
/*     */     //   21: iaload
/*     */     //   22: tableswitch default -> 96, 1 -> 48, 2 -> 84, 3 -> 84
/*     */     //   48: aload_0
/*     */     //   49: getfield actionRegex : Ljava/lang/String;
/*     */     //   52: checkcast java/lang/CharSequence
/*     */     //   55: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   58: ifne -> 65
/*     */     //   61: iconst_1
/*     */     //   62: goto -> 66
/*     */     //   65: iconst_0
/*     */     //   66: ifeq -> 80
/*     */     //   69: aload_0
/*     */     //   70: invokevirtual getRegex : ()Lkotlin/text/Regex;
/*     */     //   73: ifnull -> 80
/*     */     //   76: iconst_1
/*     */     //   77: goto -> 104
/*     */     //   80: iconst_0
/*     */     //   81: goto -> 104
/*     */     //   84: aload_0
/*     */     //   85: getfield actionRegex : Ljava/lang/String;
/*     */     //   88: ldc '*'
/*     */     //   90: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   93: goto -> 104
/*     */     //   96: new kotlin/NoWhenBranchMatchedException
/*     */     //   99: dup
/*     */     //   100: invokespecial <init> : ()V
/*     */     //   103: athrow
/*     */     //   104: ifeq -> 111
/*     */     //   107: iconst_1
/*     */     //   108: goto -> 112
/*     */     //   111: iconst_0
/*     */     //   112: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #116	-> 0
/*     */     //   #117	-> 48
/*     */     //   #117	-> 66
/*     */     //   #118	-> 84
/*     */     //   #116	-> 96
/*     */     //   #119	-> 112
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	113	0	this	Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ActionType component1() {
/*     */     return this.actionType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.actionRegex;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ActionRule copy(@NotNull ActionType actionType, @NotNull String actionRegex) {
/*     */     Intrinsics.checkNotNullParameter(actionType, "actionType");
/*     */     Intrinsics.checkNotNullParameter(actionRegex, "actionRegex");
/*     */     return new ActionRule(actionType, actionRegex);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ActionRule(actionType=" + this.actionType + ", actionRegex=" + this.actionRegex + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.actionType.hashCode();
/*     */     return result * 31 + this.actionRegex.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ActionRule))
/*     */       return false; 
/*     */     ActionRule actionRule = (ActionRule)other;
/*     */     return (this.actionType != actionRule.actionType) ? false : (!!Intrinsics.areEqual(this.actionRegex, actionRule.actionRegex));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\settings\ActionRule.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */