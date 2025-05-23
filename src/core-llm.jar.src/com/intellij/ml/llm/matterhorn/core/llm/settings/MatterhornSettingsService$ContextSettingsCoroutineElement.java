/*    */ package com.intellij.ml.llm.matterhorn.core.llm.settings;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.AbstractCoroutineContextElement;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\b\005\030\0002\0020\001B\033\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¢\006\004\b\005\020\006R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$ContextSettingsCoroutineElement;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "settings", "", "", "<init>", "(Ljava/util/Map;)V", "getSettings", "()Ljava/util/Map;", "core-llm"})
/*    */ public final class ContextSettingsCoroutineElement
/*    */   extends AbstractCoroutineContextElement
/*    */ {
/*    */   @NotNull
/*    */   private final Map<String, String> settings;
/*    */   
/*    */   public ContextSettingsCoroutineElement(@NotNull Map<String, String> settings) {
/* 62 */     super(MatterhornSettingsService.ContextSettingsKey.INSTANCE); this.settings = settings; } @NotNull public final Map<String, String> getSettings() { return this.settings; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\settings\MatterhornSettingsService$ContextSettingsCoroutineElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */