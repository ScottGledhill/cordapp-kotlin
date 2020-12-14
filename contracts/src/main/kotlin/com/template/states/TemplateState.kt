package com.template.states

import com.template.contracts.TemplateContract
import net.corda.core.contracts.BelongsToContract
import net.corda.core.contracts.ContractState
import net.corda.core.identity.AbstractParty

// *********
// * State *
// *********
@BelongsToContract(TemplateContract::class)
class IOUState(val data: String,  val value: Int, val lender: Party, val borrower: Party, override val participants get() = listOf(lender, borrower): ContractState

