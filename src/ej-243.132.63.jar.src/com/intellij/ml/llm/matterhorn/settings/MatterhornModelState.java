/*     */ package com.intellij.ml.llm.matterhorn.settings;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ActionType;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LlmProvider;
/*     */ import com.intellij.openapi.components.BaseState;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.MutablePropertyReference1;
/*     */ import kotlin.jvm.internal.MutablePropertyReference1Impl;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.properties.ReadWriteProperty;
/*     */ import kotlin.reflect.KProperty;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\007\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\006\n\002\020!\n\002\030\002\n\002\b\013\n\002\020\002\n\002\b\002\030\0002\0020\001:\001-B\007¢\006\004\b\002\020\003J\006\020+\032\0020,R/\020\006\032\004\030\0010\0052\b\020\004\032\004\030\0010\0058@@@X\002¢\006\022\n\004\b\013\020\f\032\004\b\007\020\b\"\004\b\t\020\nR/\020\016\032\004\030\0010\r2\b\020\004\032\004\030\0010\r8@@@X\002¢\006\022\n\004\b\023\020\f\032\004\b\017\020\020\"\004\b\021\020\022R/\020\024\032\004\030\0010\0052\b\020\004\032\004\030\0010\0058@@@X\002¢\006\022\n\004\b\027\020\f\032\004\b\025\020\b\"\004\b\026\020\nR+\020\031\032\0020\0302\006\020\004\032\0020\0308@@@X\002¢\006\022\n\004\b\036\020\f\032\004\b\032\020\033\"\004\b\034\020\035R7\020!\032\b\022\004\022\0020 0\0372\f\020\004\032\b\022\004\022\0020 0\0378@@@X\002¢\006\022\n\004\b&\020\f\032\004\b\"\020#\"\004\b$\020%R+\020'\032\0020\0302\006\020\004\032\0020\0308@@@X\002¢\006\022\n\004\b*\020\f\032\004\b(\020\033\"\004\b)\020\035¨\006."}, d2 = {"Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelState;", "Lcom/intellij/openapi/components/BaseState;", "<init>", "()V", "<set-?>", "", "model", "getModel$core", "()Ljava/lang/String;", "setModel$core", "(Ljava/lang/String;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;", "llmProvider", "getLlmProvider$core", "()Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;", "setLlmProvider$core", "(Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;)V", "llmProvider$delegate", "propertyFilePath", "getPropertyFilePath$core", "setPropertyFilePath$core", "propertyFilePath$delegate", "", "braveMode", "getBraveMode$core", "()Z", "setBraveMode$core", "(Z)V", "braveMode$delegate", "", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelState$Allowed;", "actionWhiteList", "getActionWhiteList$core", "()Ljava/util/List;", "setActionWhiteList$core", "(Ljava/util/List;)V", "actionWhiteList$delegate", "isDataSharingEnabled", "isDataSharingEnabled$core", "setDataSharingEnabled$core", "isDataSharingEnabled$delegate", "update", "", "Allowed", "core"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornModelPersistentStateComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornModelPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/settings/MatterhornModelState\n+ 2 BaseState.kt\ncom/intellij/openapi/components/BaseState\n*L\n1#1,106:1\n88#2:107\n*S KotlinDebug\n*F\n+ 1 MatterhornModelPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/settings/MatterhornModelState\n*L\n89#1:107\n*E\n"})
/*     */ public final class MatterhornModelState
/*     */   extends BaseState
/*     */ {
/*     */   @NotNull
/*  88 */   private final ReadWriteProperty model$delegate = BaseState.string$default(this, null, 1, null).provideDelegate(this, $$delegatedProperties[0]); @NotNull private final ReadWriteProperty llmProvider$delegate; @NotNull private final ReadWriteProperty propertyFilePath$delegate; @NotNull private final ReadWriteProperty braveMode$delegate; @NotNull private final ReadWriteProperty actionWhiteList$delegate; @NotNull private final ReadWriteProperty isDataSharingEnabled$delegate; @Nullable public final String getModel$core() { return (String)this.model$delegate.getValue(this, $$delegatedProperties[0]); } public final void setModel$core(@Nullable String <set-?>) { this.model$delegate.setValue(this, $$delegatedProperties[0], <set-?>); } static { KProperty[] arrayOfKProperty = new KProperty[6]; arrayOfKProperty[0] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(MatterhornModelState.class, "model", "getModel$core()Ljava/lang/String;", 0)); arrayOfKProperty[1] = 
/*  89 */       (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(MatterhornModelState.class, "llmProvider", "getLlmProvider$core()Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;", 0)); arrayOfKProperty[2] = 
/*  90 */       (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(MatterhornModelState.class, "propertyFilePath", "getPropertyFilePath$core()Ljava/lang/String;", 0)); arrayOfKProperty[3] = 
/*     */       
/*  92 */       (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(MatterhornModelState.class, "braveMode", "getBraveMode$core()Z", 0)); arrayOfKProperty[4] = 
/*     */       
/*  94 */       (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(MatterhornModelState.class, "actionWhiteList", "getActionWhiteList$core()Ljava/util/List;", 0)); arrayOfKProperty[5] = 
/*     */       
/*  96 */       (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(MatterhornModelState.class, "isDataSharingEnabled", "isDataSharingEnabled$core()Z", 0)); $$delegatedProperties = (KProperty<Object>[])arrayOfKProperty; }
/*     */   @Nullable public final LlmProvider getLlmProvider$core() { return (LlmProvider)this.llmProvider$delegate.getValue(this, $$delegatedProperties[1]); }
/*     */   public final void setLlmProvider$core(@Nullable LlmProvider <set-?>) { this.llmProvider$delegate.setValue(this, $$delegatedProperties[1], <set-?>); }
/*     */   @Nullable public final String getPropertyFilePath$core() { return (String)this.propertyFilePath$delegate.getValue(this, $$delegatedProperties[2]); }
/*     */   public final void setPropertyFilePath$core(@Nullable String <set-?>) { this.propertyFilePath$delegate.setValue(this, $$delegatedProperties[2], <set-?>); }
/*     */   public final boolean getBraveMode$core() { return ((Boolean)this.braveMode$delegate.getValue(this, $$delegatedProperties[3])).booleanValue(); }
/*     */   public final void setBraveMode$core(boolean <set-?>) { this.braveMode$delegate.setValue(this, $$delegatedProperties[3], Boolean.valueOf(<set-?>)); }
/*     */   @NotNull public final List<Allowed> getActionWhiteList$core() { return (List<Allowed>)this.actionWhiteList$delegate.getValue(this, $$delegatedProperties[4]); }
/*     */   public final void setActionWhiteList$core(@NotNull List <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.actionWhiteList$delegate.setValue(this, $$delegatedProperties[4], <set-?>); }
/*     */   public final boolean isDataSharingEnabled$core() { return ((Boolean)this.isDataSharingEnabled$delegate.getValue(this, $$delegatedProperties[5])).booleanValue(); } public MatterhornModelState() { BaseState this_$iv = this;
/*     */     int $i$f$enum = 0;
/* 107 */     this.llmProvider$delegate = this_$iv.doEnum(null, LlmProvider.class).provideDelegate(this, $$delegatedProperties[1]); this.propertyFilePath$delegate = BaseState.string$default(this, null, 1, null).provideDelegate(this, $$delegatedProperties[2]); this.braveMode$delegate = property(false).provideDelegate(this, $$delegatedProperties[3]); this.actionWhiteList$delegate = list().provideDelegate(this, $$delegatedProperties[4]); this.isDataSharingEnabled$delegate = property(true).provideDelegate(this, $$delegatedProperties[5]); } public final void setDataSharingEnabled$core(boolean <set-?>) { this.isDataSharingEnabled$delegate.setValue(this, $$delegatedProperties[5], Boolean.valueOf(<set-?>)); } public final void update() { incrementModificationCount(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003R/\020\006\032\004\030\0010\0052\b\020\004\032\004\030\0010\0058F@FX\002¢\006\022\n\004\b\013\020\f\032\004\b\007\020\b\"\004\b\t\020\nR/\020\016\032\004\030\0010\r2\b\020\004\032\004\030\0010\r8F@FX\002¢\006\022\n\004\b\023\020\f\032\004\b\017\020\020\"\004\b\021\020\022¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelState$Allowed;", "Lcom/intellij/openapi/components/BaseState;", "<init>", "()V", "<set-?>", "Lcom/intellij/ml/llm/matterhorn/ActionType;", "actionType", "getActionType", "()Lcom/intellij/ml/llm/matterhorn/ActionType;", "setActionType", "(Lcom/intellij/ml/llm/matterhorn/ActionType;)V", "actionType$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "actionRegex", "getActionRegex", "()Ljava/lang/String;", "setActionRegex", "(Ljava/lang/String;)V", "actionRegex$delegate", "core"}) @SourceDebugExtension({"SMAP\nMatterhornModelPersistentStateComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornModelPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/settings/MatterhornModelState$Allowed\n+ 2 BaseState.kt\ncom/intellij/openapi/components/BaseState\n*L\n1#1,106:1\n88#2:107\n*S KotlinDebug\n*F\n+ 1 MatterhornModelPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/settings/MatterhornModelState$Allowed\n*L\n103#1:107\n*E\n"}) public static final class Allowed extends BaseState { public Allowed() { BaseState this_$iv = this; int $i$f$enum = 0; this.actionType$delegate = this_$iv.doEnum(null, ActionType.class).provideDelegate(this, $$delegatedProperties[0]);
/*     */       this.actionRegex$delegate = BaseState.string$default(this, null, 1, null).provideDelegate(this, $$delegatedProperties[1]); }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     private final ReadWriteProperty actionType$delegate;
/*     */     @NotNull
/*     */     private final ReadWriteProperty actionRegex$delegate;
/*     */     
/*     */     @Nullable
/*     */     public final ActionType getActionType() {
/*     */       return (ActionType)this.actionType$delegate.getValue(this, $$delegatedProperties[0]);
/*     */     }
/*     */     
/*     */     public final void setActionType(@Nullable ActionType <set-?>) {
/*     */       this.actionType$delegate.setValue(this, $$delegatedProperties[0], <set-?>);
/*     */     }
/*     */     
/*     */     static {
/*     */       KProperty[] arrayOfKProperty = new KProperty[2];
/*     */       arrayOfKProperty[0] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(Allowed.class, "actionType", "getActionType()Lcom/intellij/ml/llm/matterhorn/ActionType;", 0));
/*     */       arrayOfKProperty[1] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(Allowed.class, "actionRegex", "getActionRegex()Ljava/lang/String;", 0));
/*     */       $$delegatedProperties = (KProperty<Object>[])arrayOfKProperty;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String getActionRegex() {
/*     */       return (String)this.actionRegex$delegate.getValue(this, $$delegatedProperties[1]);
/*     */     }
/*     */     
/*     */     public final void setActionRegex(@Nullable String <set-?>) {
/*     */       this.actionRegex$delegate.setValue(this, $$delegatedProperties[1], <set-?>);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\settings\MatterhornModelState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */