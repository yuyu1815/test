/*     */ package com.intellij.ml.llm.matterhorn.settings;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ActionType;
/*     */ import com.intellij.openapi.components.BaseState;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003R/\020\006\032\004\030\0010\0052\b\020\004\032\004\030\0010\0058F@FX\002¢\006\022\n\004\b\013\020\f\032\004\b\007\020\b\"\004\b\t\020\nR/\020\016\032\004\030\0010\r2\b\020\004\032\004\030\0010\r8F@FX\002¢\006\022\n\004\b\023\020\f\032\004\b\017\020\020\"\004\b\021\020\022¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelState$Allowed;", "Lcom/intellij/openapi/components/BaseState;", "<init>", "()V", "<set-?>", "Lcom/intellij/ml/llm/matterhorn/ActionType;", "actionType", "getActionType", "()Lcom/intellij/ml/llm/matterhorn/ActionType;", "setActionType", "(Lcom/intellij/ml/llm/matterhorn/ActionType;)V", "actionType$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "actionRegex", "getActionRegex", "()Ljava/lang/String;", "setActionRegex", "(Ljava/lang/String;)V", "actionRegex$delegate", "core"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornModelPersistentStateComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornModelPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/settings/MatterhornModelState$Allowed\n+ 2 BaseState.kt\ncom/intellij/openapi/components/BaseState\n*L\n1#1,106:1\n88#2:107\n*S KotlinDebug\n*F\n+ 1 MatterhornModelPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/settings/MatterhornModelState$Allowed\n*L\n103#1:107\n*E\n"})
/*     */ public final class Allowed
/*     */   extends BaseState
/*     */ {
/*     */   @NotNull
/*     */   private final ReadWriteProperty actionType$delegate;
/*     */   @NotNull
/*     */   private final ReadWriteProperty actionRegex$delegate;
/*     */   
/*     */   public Allowed() {
/* 103 */     BaseState this_$iv = this; int $i$f$enum = 0; this.actionType$delegate = 
/*     */ 
/*     */ 
/*     */       
/* 107 */       this_$iv.doEnum(null, ActionType.class).provideDelegate(this, $$delegatedProperties[0]);
/*     */     this.actionRegex$delegate = BaseState.string$default(this, null, 1, null).provideDelegate(this, $$delegatedProperties[1]);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final ActionType getActionType() {
/*     */     return (ActionType)this.actionType$delegate.getValue(this, $$delegatedProperties[0]);
/*     */   }
/*     */   
/*     */   public final void setActionType(@Nullable ActionType <set-?>) {
/*     */     this.actionType$delegate.setValue(this, $$delegatedProperties[0], <set-?>);
/*     */   }
/*     */   
/*     */   static {
/*     */     KProperty[] arrayOfKProperty = new KProperty[2];
/*     */     arrayOfKProperty[0] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(Allowed.class, "actionType", "getActionType()Lcom/intellij/ml/llm/matterhorn/ActionType;", 0));
/*     */     arrayOfKProperty[1] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(Allowed.class, "actionRegex", "getActionRegex()Ljava/lang/String;", 0));
/*     */     $$delegatedProperties = (KProperty<Object>[])arrayOfKProperty;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String getActionRegex() {
/*     */     return (String)this.actionRegex$delegate.getValue(this, $$delegatedProperties[1]);
/*     */   }
/*     */   
/*     */   public final void setActionRegex(@Nullable String <set-?>) {
/*     */     this.actionRegex$delegate.setValue(this, $$delegatedProperties[1], <set-?>);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\settings\MatterhornModelState$Allowed.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */