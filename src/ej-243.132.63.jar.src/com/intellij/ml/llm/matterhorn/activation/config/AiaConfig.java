/*    */ package com.intellij.ml.llm.matterhorn.activation.config;
/*    */ 
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.SnapshotStateKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieApiUrl;
/*    */ import com.intellij.openapi.components.Service;
/*    */ import com.intellij.util.SystemProperties;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KProperty;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service({Service.Level.APP})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\004\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\tR\033\020\n\032\0020\0138BX\002¢\006\f\n\004\b\r\020\016\032\004\b\n\020\fR\035\020\017\032\004\030\0010\0208FX\002¢\006\f\n\004\b\022\020\023\032\004\b\021\020\t¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/config/AiaConfig;", "", "cs", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "grazieConfigJsonRawUrl", "", "getGrazieConfigJsonRawUrl", "()Ljava/lang/String;", "isGrazieStaging", "", "()Z", "isGrazieStaging$delegate", "Landroidx/compose/runtime/MutableState;", "grazieStagingUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;", "getGrazieStagingUrl-0_pFto0", "grazieStagingUrl$delegate", "Landroidx/compose/runtime/State;", "config"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nAiaConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiaConfig.kt\ncom/intellij/ml/llm/matterhorn/activation/config/AiaConfig\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,60:1\n81#2:61\n81#2:62\n*S KotlinDebug\n*F\n+ 1 AiaConfig.kt\ncom/intellij/ml/llm/matterhorn/activation/config/AiaConfig\n*L\n35#1:61\n40#1:62\n*E\n"})
/*    */ public final class AiaConfig
/*    */ {
/*    */   @NotNull
/* 33 */   private final String grazieConfigJsonRawUrl = "https://www.jetbrains.com/config/JetBrainsAIPlatform.json"; @NotNull public final String getGrazieConfigJsonRawUrl() { return this.grazieConfigJsonRawUrl; }
/*    */   
/*    */   @NotNull
/* 36 */   private final MutableState isGrazieStaging$delegate = SystemProperties.getBooleanProperty("ij.idea.grazie.is.staging", false) ? SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(true), null, 2, null) : 
/* 37 */     SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(false), null, 2, null);
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
/*    */   private final boolean isGrazieStaging()
/*    */   {
/*    */     State state = (State)this.isGrazieStaging$delegate;
/*    */     KProperty property$iv = null;
/*    */     int $i$f$getValue = 0;
/* 61 */     return ((Boolean)state.getValue()).booleanValue(); } @Nullable public final String getGrazieStagingUrl-0_pFto0() { State state = this.grazieStagingUrl$delegate; KProperty property$iv = null; int $i$f$getValue = 0;
/* 62 */     (GrazieApiUrl)state.getValue(); return ((GrazieApiUrl)state.getValue() != null) ? ((GrazieApiUrl)state.getValue()).unbox-impl() : null; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private final State grazieStagingUrl$delegate = SnapshotStateKt.derivedStateOf(new AiaConfig$grazieStagingUrl$2());
/*    */   public static final int $stable;
/*    */   
/*    */   public AiaConfig(@NotNull CoroutineScope cs) {}
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class AiaConfig$grazieStagingUrl$2 implements Function0<GrazieApiUrl> {
/*    */     public final String invoke-0_pFto0() {
/*    */       return AiaConfig.this.isGrazieStaging() ? GrazieApiUrl.Companion.fromResolvedUrl-kmrddwU(AiaConfigGrazieStagingUrlUtil.resolveStagingUrl$default(AiaConfigGrazieStagingUrlUtil.INSTANCE, null, null, 3, null)) : null;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\config\AiaConfig.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */